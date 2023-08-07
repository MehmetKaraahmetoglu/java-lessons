package day08_IfElseStatements;

import java.util.Scanner;

public class C06_NestedIfElseStatements {
    public static void main(String[] args) {
        //Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz E: Erkek, K: Kadin");
        char Cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi giriniz:");
        double yas  = scanner.nextDouble();

        /*
        Birden fazla degisken varsa iclerinden birini birincil  degisken olarak alip
        sadece ona gore bir if- else if- else kuralim.
         */

        if (Cinsiyet == 'E'){

            if (yas<0 || yas>100) System.out.println("Gecersiz yas girildi");

            else if (yas>65) System.out.println("Erkek emekli olabilir");

            else System.out.println("Emekli olmak icin daha " + (65-yas) + " yil calismalisin" );


        }else if (Cinsiyet=='K'){

            if (yas<10 || yas>100) System.out.println("Gecersiz yas girildi");

            else if (yas>60) System.out.println("Kadin emekli olabilir");

            else System.out.println("Emekli olmak icin daha " + (60-yas) + " yil calismalisin" );


        }else System.out.println("Cinsiyet hatali girildi.");
    }
}

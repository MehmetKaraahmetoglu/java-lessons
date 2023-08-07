package day08_IfElseStatements;

import java.util.Scanner;

public class C05_Emeklilik {
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

        if (Cinsiyet== 'E' && yas>=65) System.out.println("Erkek emekli olabilir");
        else if (Cinsiyet== 'E' && yas<65) System.out.println("Erkek emekli olamaz, "+ (65-yas)+ " yil daha calismalisiniz");
        else if (Cinsiyet== 'K' && yas>=60) System.out.println("Kadin emekli olabilir");
        else if (Cinsiyet== 'K'&& yas<60) System.out.println("Kadin emekli olama,"+(60-yas)+ " yil daha calismalisin");;
    }
        }

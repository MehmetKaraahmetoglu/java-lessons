package day07_ifStatements;

import java.util.Scanner;

public class C06_BagimsizIfCumleleriOrnek2 {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tam sayi isteyin
        //sayi 3 veya 5 ile bolunebiliyorsa
        //"güzel sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0 || girilenSayi % 5 == 0);
        System.out.println("güzel sayi");


    }
}

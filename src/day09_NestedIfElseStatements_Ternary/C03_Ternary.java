package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        //kullanicidan pozitif bir tamsayi alin
        //sayinin tek mi cift mi oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 2==0) {
            System.out.println("cift sayi");
        }else {
            System.out.println("tek sayi");
        }

        /*
        If else ile yapabilecegimiz
        basit islemleri
        daha kisa olara kyazabilmek icin ternary kullanilir
         */

        System.out.println(sayi % 2 == 0 ? "cift sayi" : "tek sayi");
    }
}

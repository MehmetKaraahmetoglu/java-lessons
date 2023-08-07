package day14_forLoops;

import java.util.Scanner;

public class C04_Faktoriyel {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20'den kücük bir tam sayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        int carpim =1;

        for (int i = 1; i <=girilenSayi ; i++) {
            carpim *= i;

        }
        System.out.println("Girilen sayi olan " + girilenSayi+ "! = "+carpim);
    }
}

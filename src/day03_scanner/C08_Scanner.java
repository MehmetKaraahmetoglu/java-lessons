package day03_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
        //sayilar 20 ve 10

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi giriniz.");
        int ilkSayi = scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz.");
        int ikinciSayi = scanner.nextInt();

        ilkSayi = ilkSayi+ikinciSayi; //yeni ilk sayi 20+10=30

        ikinciSayi= ilkSayi-ikinciSayi; // yeni ikinci sayi 30-10=20

        ilkSayi = ilkSayi- ikinciSayi; // yeni ilk sayi 30- yeni ikinci sayi 20 = 10


        System.out.println("ilk sayi: " + ilkSayi);
        System.out.println("ikinci sayi: " + ikinciSayi);




    }
}

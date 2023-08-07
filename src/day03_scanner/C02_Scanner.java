package day03_scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {


        //Kullanicidan bir tam sayi alip, karesini yazdirin.

        //Scanner ile kullanicidan bir bilgiyi 3 adimda alabiliriz
        //1.adim: Scanner objesi olusturmak

        Scanner scanner = new Scanner(System.in);

        //2. adim: Kullaniciya ne istediginizi soyleyin.

        System.out.println("Lutfen bir tam sayi giriniz" );

        //3.adim: Istediginiz datanin turune uygun bir variable olusturun.
        //       ve scanner objesini kullanarak uygun method'la
        // kullanicinin girdigi degeri alin

        int girilenSayi = scanner.nextInt();

        //artik kullanicinin girdigi sayi kod ortaminiza kaydedildi
        //bu variable'i istedigimiz sekilde kullanabiliriz.

        System.out.println("Girilen sayinin karesi: " +girilenSayi*girilenSayi);
    }
}

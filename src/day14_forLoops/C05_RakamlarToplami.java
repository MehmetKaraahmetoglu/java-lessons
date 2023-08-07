package day14_forLoops;

import java.util.Scanner;

public class C05_RakamlarToplami {
    public static void main(String[] args) {
        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.(1453 icin 1+2+3+4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlarini toplamak üzere pozitif bir tam sayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        int basamakSayisi = (sayi + "").length(); //yana hiclik ekleyerek int'i stringe ceviirp lenghti kullanabiliriz

        for (int i = 1; i <= basamakSayisi; i++) {
            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;


        }
        System.out.println("Girilen sayinin rakamlar toplami: " + rakamlarToplami);

    }
}

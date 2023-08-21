package day40_interfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exceptions {
    public static void main(String[] args) {
        //Kullanicidan toplanmak üzere sayilar alin.
        //Kullanici Q'ya bastiginda islemi bitirin
        //ve girilen sayilarin toplamini yazdirin.

        int toplam = 0;
        int girilenSayi = 0;
        Scanner scanner = new Scanner(System.in);

/*
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.println("Lütfen toplamak üzere sayi giriniz: ");
                girilenSayi=scanner.nextInt();
                toplam += girilenSayi;


            }
        } catch (InputMismatchException e) {
            char girilenYanlisHarf = scanner.next().charAt(0);
            if (girilenYanlisHarf=='Q' || girilenYanlisHarf=='q'){
                System.out.println("girdiginiz sayilarin toplami: "+toplam);
            }else {
                System.out.println("Yanlis input, program bitiriliyor...");
            }
        }

 */
        for (int i = 0; i < 100000; i++) {
            try {
                    System.out.println("Lütfen toplamak üzere sayi giriniz: ");
                    girilenSayi = scanner.nextInt();
                    toplam += girilenSayi;



            } catch (InputMismatchException e) {
                char girilenYanlisHarf = scanner.next().charAt(0);
                if (girilenYanlisHarf == 'Q' || girilenYanlisHarf == 'q') {
                    System.out.println("girdiginiz sayilarin toplami: " + toplam);
                    break;
                } else {
                    System.out.println("Yanlis input, lütfen bir sayi girin");
                    //burada try catch for icinde oldugu icin istenen q harfi girilene kadar istemeye devam ediyor.
                    //yukarida ise for loop try catch icindeydi.
                }
            }

        }


    }
}

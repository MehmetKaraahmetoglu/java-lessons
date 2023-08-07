package day17_methodOlusturma_methodOverLoading;

import java.util.Scanner;

public class C01_AsalSayiBulma {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan main method icinde 2'den buyuk pozitif bir tamsayi alin.
        //        Girilen sayinin asal sayi olup olmadigini kontrol edip,
        //        sonuc olarak “true” veya “false” sonuclarini donduren bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Asal sayi kontrolü icin pozitif bir tam sayi giriniz.");
        int sayi = scanner.nextInt();

        System.out.println(asalSayiMi(sayi));


        //ne döndurecekse onu yaziyoruz asagida
    }

    public static boolean asalSayiMi(int sayi) {

        boolean flag = true;
        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                flag = false;
                break;
            }

        }
        if (flag) {
            return true;
        } else {
            return false;
        }
    }
}

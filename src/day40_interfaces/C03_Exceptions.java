package day40_interfaces;

import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        //Kullanicidan 2 tam sayi isteyin
        //sayilari birbirine bolup, sonucu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki tam sayi giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
/*
        if (sayi2==0){
            System.out.println("2. syi 0 olamaz.");
        }else{
            System.out.println(sayi1/sayi2);
        }

 */

        try {
            System.out.println(sayi1 / sayi2); //Riskli kod,Aritmetik exception
        } catch (ArithmeticException e) {
            System.out.println("Ikinci sayi 0 olamaz");;
        }

        /*
        Normal sartlarda kodumuzda bir sorun yok ama istisnai olarak
        2. sayi=0 verilirse
        sayi/0 tanimsiz oldugundan
        Java ne yapacagini bilemez.
        "ArithmeticException" hatasi verir

        Kodumuzu yazarken bu ihtimali ön görmeli ve bu istisna olustugunda ne yapmasi gerektigini
        Javaya söylemelisiniz.

        Bu soruda bu istisnai durumu if-else ile cozebiliriz ama if else her zaman ise yaramaz.


       Java exception'lari yönetebilmemiz icin(handle) try -catch bloklari olusturmustur.
       Ty- catch bloklari 3 bölümden olusur.
       1-Try blogu; Yapmak isteddigimiz,sorun cikarma potansiyeline sahip code parcacigi
       2-Catch keyword ve () sabittir. Parantez icine yazilacak exception türü kodumuza göre degisecektir.
         e yakalanan
         */
    }
}

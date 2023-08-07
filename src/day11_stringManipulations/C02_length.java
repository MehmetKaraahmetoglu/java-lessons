package day11_stringManipulations;

import java.util.Scanner;

public class C02_length {
    public static void main(String[] args) {

        String isim = "Ramazan Uzunkavaklaraltindayataruyumazoglu";

        //son harfi yazdirin

        System.out.println("Isim uzunlugu: " + isim.length()); //42 karakter

        System.out.println("son harf: " + isim.charAt(isim.length()-1));


        //sondan 5. harfi yazdirin

        System.out.println("sondan 5.harf: " + isim.charAt(isim.length()-5)); //z

        //kullanicidan ismini alin
        //ve ortadaki harfi yazdirin
        //ismin uzunlugu cift sayi ise orta kisimdaki 2 harfi yazdirin

        Scanner scn = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");

        String girilenIsim= scn.nextLine();

        int  uzunluk = girilenIsim.length();

        if (uzunluk % 2  == 0 ) { //uzunluk ciftse (omer)
            System.out.println("uzunluk cift,ortadaki iki harf: " +
                    girilenIsim.charAt(uzunluk/2 -1) +
                    girilenIsim.charAt(uzunluk/2));

        }else {  //uzunluk tekse
            System.out.println("Uzunluk tek, ortadaki harf : " + girilenIsim.charAt((uzunluk-1)/2));

        }
    }



}

package day41_exceptions;

import java.util.Arrays;

public class C04_NumberFormatException_ClassCastException {
    public static void main(String[] args) {

        String str = "Java icin bulunan sonuc sayisi : 4567, listelenen sonuc sayisi : 25";

        //Sonuc sayisinin 1000'den fazla oldugunu test edin.

        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); //[Java, icin, bulunan, sonuc, sayisi, :, 4567,, listelenen, sonuc, sayisi, :, 25]

        String sonucSayisiStr = kelimeler[6]; // "4567," burdaki virgül oldugu icin exception veriyor
        sonucSayisiStr = sonucSayisiStr.replaceAll("\\D","");
        int sonucSayisiInt = Integer.parseInt(sonucSayisiStr);


        System.out.println(sonucSayisiInt); // 4567


        String str2="Java";
        // Integer sayi =str2

        Object obj =str2; // obje Stringin parenti oldugundan sorun ckmaz
        Integer sayi = (Integer) obj;
        //ClassCastException verdi
        System.out.println(sayi);
    }
}

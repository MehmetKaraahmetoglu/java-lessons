package day10_switchCase_StringManipulations;

public class C05_equals {
    public static void main(String[] args) {

        String str1 = "Mehmet";
        String str2 = "MEHMET";
        String str3 = "mehmet";
        String str4 = "MEHmet";

        System.out.println(str1 == str2);  //false

        System.out.println(str3 == str4.toLowerCase());  //mehmet== mehmet false

        System.out.println(str2 == str3.toUpperCase());  //MEHMET==MEHMET false

        /*
        Stringlerde == bekledigimiz sonuclari DONMEYEBILIR
        bunun sebebi String class'ini olustururken yapilan bazi ozelliklerdir.
        Bu konu ileride detayli bir sekilde anlatilacaktir.

        Verilen iki String'in metinsel olarak ayni olup olmadigini
        kontrol etmek icin == yerine equals() kullanilir.

        equals()'u birebir ayni olan iki metin icin true,
        farkli metinler icin false sonucu üretir(döndürür)
        bu karsilastirmada metnin ayni olmasi yaninda,
        buyuk kucuk harf durumunu da kontrol  eder (case sensitive)

        EGER case sensitive olmadan metinleri karsilastirmak istersek
        equalsIgnoreCase()'u kullanilir
         */

        System.out.println(str1.equals(str2)); //Mehmet -- MEHMET false
        System.out.println(str3.equals(str4.toLowerCase()));  //mehmet -- mehmet  true
        System.out.println(str2.equals(str3.toUpperCase()));  //MEHMET -- MEHMET true


        System.out.println(str1.equalsIgnoreCase(str2)); //Mehmet -- MEHMET true
        System.out.println(str1.equalsIgnoreCase(str3)); //Mehmet -- mehmet true

    }
}

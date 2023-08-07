package day04_dataCasting_wrapperClass;

public class C03_CharDataCasting {
    public static void main(String[] args) {
        /*

        char data turu ozel bir data turudur
        her ne kadar char data turu
        ' ' icerisinde sayi,harf,oyel karakter alsa da
        ASCII tablosundaki sayisal degerleri de kullanabilir

        ayni sekilde
        char data turundeki bir variable'i
        matematiksel islemde kullanirsaniz
        ASCII tablosundaki degeri ile matematiksel isleme girer
         */
        char ch1 = 'a';

        int sayi1 = ch1;

        System.out.println("ch1 : " + ch1);
        System.out.println("sayi1 : "+ sayi1);

        String st1 = "Java";
        String str2 = " ";
        String str3 = "candir.";

        System.out.println(st1+str2+str3);  //Java candir.

        char ch2 = 'a';
        char ch3 = 'b';

        System.out.println(ch2+ch3); //97+98=195

        //verilen int bir sayinin ASCII tablosundaki Char karsiligini yazdirin.

        int karakter= 97;
        char asciDegeri = (char)karakter;

        System.out.println("verilen sayinin asci tablosundaki karsiligi : " + asciDegeri);

    }
}

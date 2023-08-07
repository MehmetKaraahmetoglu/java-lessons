package day03_scanner;

public class C01_NamingConvention {
    public static void main(String[] args) {

        int sayi=10;
        //int sayi=20;
        // long sayi=20;

        int Sayi=25;
        int SAYI=23;
        int sAYi=45;

        System.out.println(sAYi); //45 sonucu
        System.out.println(SAYI); //23 sonucu cikar

        //Variable isimleri kucuk harfle baslar
        //buyuk harfle baslarsak Java kabul eder
        //ancak genel kullanima aykiridir.

        // int sa yi=34; kabul etmez
        //int sa&yi=45 kabul etmez
        int say_i=34;
        int sayi123445=12345;
        int sa$yi=21;

        //int sa.yi=65 kabul etmez

        //$ ve _ isimde kullanilabilir ama ilk harf olarak kullanilmasi
        //naming conventiona uygun degildir.

        int _sayi=75;
        int $sayi=87;

        //birden fazla kelimeden olusan bir isim varsa camelCase kullanilir.

        int sinifinEnYuksekNotu = 99;  //ilk harf kucuk sonraki her kelimenin bas harfi buyuk
        int maxSayi = 123;

    }
}

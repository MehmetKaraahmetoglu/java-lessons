package day22_arrays_multiDimensionalArrays;

public class C01_Arrays {
    public static void main(String[] args) {

        String[] isimler = {"Ayse","Yusuf","Bugra","Abdullah","Nergiz"};

        //verilen bir array'deki uzunlugu tek sayi olan isimleri
        //yan yana aralarinda 1 bosluk birakarak yazdirin.
        //en sonda alt satira gecerek toplam kac isim yazdirildigini yazdirin.

        int sayac = 0;
        int kelimeUzunlugu = 0;

        for (int i = 0; i < isimler.length; i++) {

            kelimeUzunlugu =isimler[i].length();

            if (kelimeUzunlugu % 2 != 0){
                System.out.print(isimler[i] + " ");
                sayac++;
            }

        }
        System.out.println("\nToplam " + sayac + " adet yazdirildi.");
    }
}

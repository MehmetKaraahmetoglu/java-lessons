package day21_arrays;

import java.util.Arrays;

public class C06_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {

        int[] arr ={2,4,6,8};
        System.out.println("Eski array: " + Arrays.toString(arr));  // [2, 4, 6, 8]

        arr =C02_ArrayinElementleriniIstenenKadarArtirma.elementleriArtir(arr,4);
        System.out.println("yeni array: " + Arrays.toString(arr));   // [6, 8, 10, 12]

        System.out.println(C03_PozitifElementleriTopla.pozitifElementleriTopla(arr));  //36

        C04_ElementSay.elemanSay(arr,6); //Method void oldugu icin sout yapmamiza gerek yok
        //Aranan 6 sayisi array'de 1 kere kullanilmis.

        //Kullanicidan deger alarak int[ olusturmak istiyorum

        int[] kullaniciArrayi = C05_ArrayOlustur.arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));  //uzunlugu girip, degerleri girdik [10, 20, 30, 40]

    }
}

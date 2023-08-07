package day20_arrays;

import java.util.Arrays;

public class C02_ArrayElementleriniGuncelleme {
    public static void main(String[] args) {

        int[] sayilar = new int[6];
        System.out.println(Arrays.toString(sayilar));  // [0, 0, 0, 0, 0, 0]

        //2. index'te ki elementi 5 yapin
        sayilar[2] = 5;

        System.out.println(Arrays.toString(sayilar));   // [0, 0, 5, 0, 0, 0]

        //2. index'te ki elementi  7 yapin
        sayilar[2] =7;

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 7, 0, 0, 0]

        //index kullanmadan bir elemente atama yapmak  mümkün degildir.

        //  5. index'te  ki elementi 8 yapin
        sayilar[5] = 8;
        System.out.println(Arrays.toString(sayilar)); //[0, 0, 7, 0, 0, 8]

        //6. index'e yeni bir element ekleyin
        sayilar[6] = 20;  //ArrayIndexOutOfBoundsException
        //run dedikten sonra bu hata olustugu icin
        // buna  RTE (run time error) denir.
        //kodun altini kirmizi ile cizerse buna da CTE denir.


        /*
        Uzunlugu verilen bir array'de
        var olan elementler index ile update edilebilir
        ANCAK
        yeni element ekleyip uzunlugunu degistirmak isterseniz
        RunTimeError olusur
         */


    }
}

package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C06_ArrayeBirElemanEkleme {
    public static void main(String[] args) {
        // Verilen bir Array'in uzunlugunu 1 artirarak
        // verilen bir elementi ekleyin.

        int[] arr = {3, 7, 8};
        int eklenecekSayi = 10;

        // 1- Önce uzunlugu eski Array'den bir fazla olan yeni Arr olusturalim.

        int[] yeniArr = new int[arr.length + 1]; // [0, 0, 0, 0]

        // 2- Arr'de ki var olan elementleri, ayni indexler ile
        //    yeni arr'ye tasiyalim.

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i];

        }
        System.out.println(Arrays.toString(yeniArr)); //[3, 7, 8, 0]  en son sifir cünkü uzunlugu artirip oraya elmenent
        //atamadik.

        // 3- eklenecek elementi, yeniArr'in son indexine atayalim

        yeniArr[yeniArr.length - 1] = eklenecekSayi;

        System.out.println(Arrays.toString(yeniArr)); //[3, 7, 8, 10]

        // 4- Eski arr'ye yeni degeri atayalim
        arr = yeniArr;

        System.out.println("arr'nin son hali: " + Arrays.toString(arr));


    }

    public static int[] arrayeBirElemanEkle(int[] eskiArr, int eklenecekSayi) {

        int[] yeniArr = new int[eskiArr.length + 1];

        for (int i = 0; i < eskiArr.length; i++) {
            yeniArr[i] = eskiArr[i];

        }
        yeniArr[yeniArr.length - 1] = eklenecekSayi;

        eskiArr = yeniArr;

        return yeniArr;
    }

}

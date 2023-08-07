package day25_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArrayiListeCevirme {
    public static void main(String[] args) {

        Integer [] arr = {1,3,4,6,7,1,3,8,5,2,3,4,9,0,1,2,5,4,3,2};

        //Bu arrayi bir list olarak kaydedin.

        List<Integer> forList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            forList.add(arr[i]);

        }
        System.out.println(forList); //[1, 3, 4, 6, 7, 1, 3, 8, 5, 2, 3, 4, 9, 0, 1, 2, 5, 4, 3, 2]
        /*
        Arrays classi bize verilen arrayi liste cevirren hazir method sunuyor.

        Ancaaaaakkkkkk

        bu method'u kullanarak bir arrayi list'e cevirmenin iki buyuk dezavantaji var.
        1) add() ve remove() gibi listin uzunlugunu degistiren methodlari desteklemez.
        2) Her ne kadar biz bir list olusturmus olsak da
           java arka  planda hazir method ile  olusturulan list ve kaynak arr'yi ilisiklendirir.
           Birinde yapilan degisiklik, digerine de islenir.
         */

        List<Integer> hazirMethodList = Arrays.asList(arr);
        System.out.println(hazirMethodList); //[1, 3, 4, 6, 7, 1, 3, 8, 5, 2, 3, 4, 9, 0, 1, 2, 5, 4, 3, 2]

        forList.remove(3);
        System.out.println(forList); //[1, 3, 4, 7, 1, 3, 8, 5, 2, 3, 4, 9, 0, 1, 2, 5, 4, 3, 2]

        // hazirMethodList.remove(3);
        // System.out.println(hazirMethodList);  //UnsupportedOperationException  HATAAA

        forList.set(0,10); // 0. indexi 10 yap
        System.out.println(forList); // [10, 3, 4, 7, 1, 3, 8, 5, 2, 3, 4, 9, 0, 1, 2, 5, 4, 3, 2]
        System.out.println(Arrays.toString(arr)); //[1, 3, 4, 6, 7, 1, 3, 8, 5, 2, 3, 4, 9, 0, 1, 2, 5, 4, 3, 2]
// ama arr degismez

        hazirMethodList.set(0,20);
        System.out.println(hazirMethodList); //[20, 3, 4, 6, 7, 1, 3, 8, 5, 2, 3, 4, 9, 0, 1, 2, 5, 4, 3, 2]
        System.out.println(Arrays.toString(arr)); //[20, 3, 4, 6, 7, 1, 3, 8, 5, 2, 3, 4, 9, 0, 1, 2, 5, 4, 3, 2]
// ama bu sefer arrayi degismedigimiz halde listeyi degistigimiz icin arr de degismis oldu
    }
}

package day26_forEachLoop_constructer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_IkiiAyriArraydekiOrtakElementleriBulma {
    public static void main(String[] args) {
        //Soru 5- Verilen iki array’in elementlerini karsilastirip,
        //        ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.

        Integer[] arr1 = {3, 5, 8, 1, 3, 9, 2, 4, 7, 1};
        Integer[] arr2 = {2, 7, 3, 5, 8, 1, 9, 0, 3, 5, 7};

        //iki Array'in elementlerini bana getirmesi icin ic ice 2
        //for-each loop olusturalim
        //elementleri karsilastiralip, eger esitlerse ve daha once listeye eklenmemisse
        //listeye ekleyelim

        List<Integer> ortakElementListesi = new ArrayList<>();

        for (Integer each1 : arr1
        ) {
            for (Integer each2 : arr2
            ) {
                if (each1 == each2 && !ortakElementListesi.contains(each1)) {
                    ortakElementListesi.add(each1);
                }
            }

        }
        Collections.sort(ortakElementListesi); //siraladi rakamlari
        System.out.println(ortakElementListesi);  // [1, 2, 3, 5, 7, 8, 9]

    }
}

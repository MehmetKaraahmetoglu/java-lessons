package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_TamBolenlerListesi {
    public static void main(String[] args) {
        //Soru 6- Verilen bir tamsayiyi
        //        tam bolebilen tum pozitif tamsayilari
        //        bir liste olarak bize donduren bir method olusturun.

        System.out.println(tamBolenelerListesi(20));  //[1, 2, 4, 5, 10, 20]
        System.out.println(tamBolenelerListesi(120));  //[1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 20, 24, 30, 40, 60, 120]


    }

    public static List<Integer> tamBolenelerListesi(int sayi){
        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi % i ==0){
                tamBolenlerListesi.add(i);
            }

        }
        return tamBolenlerListesi;

    }

}

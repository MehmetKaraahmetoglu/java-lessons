package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Kaan");
        isimler.add("Bülent");
        isimler.add("Tugba");
        isimler.add("Burhan");
        isimler.add("Kaan");

        System.out.println(isimler);  //[Kaan, Bülent, Tugba, Burhan, Kaan]

        System.out.println(isimler.remove("Hasan")); //Hasan diye bir isim olmadigi icin False

        System.out.println(isimler.remove("Kaan")); //True

        System.out.println(isimler); //[Bülent, Tugba, Burhan, Kaan]

        System.out.println(isimler.remove(1)); // tugba (sildigi elementi gösterir

        System.out.println(isimler); //[Bülent, Burhan, Kaan]

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(1);

        System.out.println(sayilar); //  [3, 5, 7, 1]

        System.out.println(sayilar.remove(1));  // silinen elementi gösteriyor 5
        System.out.println(sayilar); //[3, 7, 1]

        //ben illa da element olan 1'i silmek istersem
        System.out.println(sayilar.lastIndexOf(1));

        Integer silinecekElement  = 1;
        sayilar.remove(silinecekElement);
        System.out.println(sayilar);  //[3, 7]

        sayilar.clear();
        System.out.println(sayilar); // []  hepsini sildi clear

    }
}

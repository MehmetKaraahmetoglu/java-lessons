package day43_collections;

import java.util.*;

public class C03_ArraydenTekrarEdenleriSilme {
    public static void main(String[] args) {

        int[] arr ={2,4,5,6,3,4,2,1,5,6,4,3,2,3,0,1,3,4,2,5};
        //verilen arraydeki tekrar eden elementleri silip
        //array'i her elementin sadece 1 kere kullanildigi bir hale donusturun.

        //bos bir list olusturup, arraydeki elementleri tek tek ele aldik daha önce.
        //ele aldigimiz element listte yoksa list'e ekledik

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int each: arr
             ) {
            if (!tekrarsizList.contains(each)){
                tekrarsizList.add(each);
            }

        }
        System.out.println(tekrarsizList); //[2, 4, 5, 6, 3, 1, 0]


        //Ayni isi Set ile daha kolay yapabiliriz

        Set<Integer> tekrarsizSet = new TreeSet<>(); //hemde siralasin dedik
        for (int each: arr
             ) {
            tekrarsizSet.add(each);

        }
        System.out.println(tekrarsizSet); //[0, 1, 2, 3, 4, 5, 6]

        System.out.println(Arrays.toString(arr)); //[2, 4, 5, 6, 3, 4, 2, 1, 5, 6, 4, 3, 2, 3, 0, 1, 3, 4, 2, 5]
        //Array hala ayni, tekrarsiz elementleri Set olarak elde ettik
        //Arrayi set deki elementlerden olusan hale donusturelim

        arr=new int[tekrarsizSet.size()];
        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0, 0, 0]

        int index = 0;
        for (Integer each : tekrarsizSet
             ) {
            arr[index]=each;
            index++;

        }

        System.out.println(Arrays.toString(arr)); //[0, 1, 2, 3, 4, 5, 6]
        //Array istedigimiz halini aldi.
    }
}

package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C03_binarySearch {
    public static void main(String[] args) {

        int[] arr ={0,13,4,7,10,2,1,23};

        System.out.println(Arrays.binarySearch(arr, 13));  //-8   //sort ettikten sonra 6
        System.out.println(Arrays.binarySearch(arr,7));  // 3       // sort ettikten sonra 4
        System.out.println(Arrays.binarySearch(arr, 10)); // -8     //5
        System.out.println(Arrays.binarySearch(arr,4)); // -2       //3

        /*Binary yapisi cok buyuk datalari kolayca depolayabilmek icin
        Java'nin kullandigi bir yöntemdir.

        Binary mantigi aranan sayinin kolayca bulunmasina dayanir.
        Binary search'in saglikli calismasi icin öncelikle Array'i
        kücükten buyuge siralamalisiniz.

        siralama yapmadan binarySearch() kullanilirsa
        sonuc icin hic birsey diyemeyiz.
        Dogru da olabilir, yanlis da olabilir.

         */

        Arrays.sort(arr);  //önce siralarsak,  dogru sekilde buluruz
        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 4, 7, 10, 13, 23]

        //olmayan bir elementi aratirsak

        System.out.println(Arrays.binarySearch(arr, -5)); //-1
        System.out.println(Arrays.binarySearch(arr, 5)); //-5
        System.out.println(Arrays.binarySearch(arr, 25)); //-9
        System.out.println(Arrays.binarySearch(arr, 44)); //-9





    }
}

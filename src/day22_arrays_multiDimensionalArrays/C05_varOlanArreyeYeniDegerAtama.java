package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C05_varOlanArreyeYeniDegerAtama {
    public static void main(String[] args) {


    /*

    Var olan bir Array'e length olarak belirlenenden
    daha fazla element ATANAMAZ.

    Ancak
    Var olan bir Array'e baska bir Array'i
    deger olarak atayabiliriz.

     */
        int[] arr = {3, 4, 5, 6, 8, 1};
        System.out.println(arr.length); // 6

        // 7. elementi bu array'e atayabilirmiyiz?
        // arr[6] = 13; //ArrayIndexOutOfBoundsException

        arr = new int[8];
        System.out.println(Arrays.toString(arr)); //  [0, 0, 0, 0, 0, 0, 0, 0]

        String[] harfler = {"a","n","y"};
        String[] yeniHarfler = {"k","l","m","n"};

        harfler = yeniHarfler;
        System.out.println(Arrays.toString(harfler)); //[k, l, m, n]

        System.out.println(Arrays.toString(yeniHarfler)); //[k, l, m, n]

        //Eger var olan bir arrye yeni deger atamasi yapmak ocon
        //Liste yazmak istiyorsak asagidaki gibi atama yapabiliriz.
        harfler = new String[] {"X"};
        System.out.println(Arrays.toString(harfler)); // [x]

    }
}
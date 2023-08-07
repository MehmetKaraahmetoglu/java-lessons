package day23_multiDimensionalArrays;

public class C01_TumElementleriToplama {
    public static void main(String[] args) {

        int[] arrTek={3,7,1,9};

        //bu Array'in tüm elementlerini toplayin
        int toplam=0;
        for (int i = 0; i < arrTek.length; i++) {

            // arrTek[i] index degistikce bize tüm elementleri sirasiyla getirir.

            toplam += arrTek[i];
        }
        System.out.println("arrTek'in elementleri toplami: " + toplam); // 20

        int[][] sayilar =  { {1,2,5} , {7,4} , {9} , {3,0,1} };

        //arr[i] inner arrayi getirir.
        //arr[i][j]bize int elementleri verir.
        //yani kat sayisi kadar intdex'e yani forloop'a ihiyacimiz var.

        toplam = 0;
        for (int i = 0; i < sayilar.length; i++) { //disardaki for loop outer arrayi kontrol  eder.

            for (int j = 0; j < sayilar[i].length ; j++) { //icerdeki for loop inner arrayleri kontrol  eder.
                toplam += sayilar[i][j];
                // sayilar[i][j] sirasiyla her bir int elementi getirir.

            }

        }
        System.out.println("sayilar array'inin elementleri toplami: " + toplam); // 32
    }
}

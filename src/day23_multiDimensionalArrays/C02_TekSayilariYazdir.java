package day23_multiDimensionalArrays;

public class C02_TekSayilariYazdir {
    public static void main(String[] args) {

        int [][] arr=  {{3,6,9},{2,5,9},{1,3},{12,23,24}};

        //verilen arraydeki tek sayilari
        //aralarinda bir bosluk birakarak yanyana yazdirin
        // en sona da "toplam ....  sayi yazdirildi." seklinde aciklama yazdirin

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {  //outer arrayi kontrol eder

            for (int j = 0; j < arr[i].length; j++) { //inner array'leri kontroil eder.

                //arr[i][j] tüm elementleri sirasiyla getirir
                if (arr[i][j] % 2 == 1){

                    System.out.print(arr[i][j] + " ");
                    sayac++;
                }

            }

        }
        System.out.println("\ntoplam "  + sayac + " sayi yazdirildi.");

    }
}

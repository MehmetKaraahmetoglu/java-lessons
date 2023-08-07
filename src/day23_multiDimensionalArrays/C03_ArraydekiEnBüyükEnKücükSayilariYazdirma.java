package day23_multiDimensionalArrays;

public class C03_ArraydekiEnBüyükEnKücükSayilariYazdirma {
    public static void main(String[] args) {
        //Verilen 2 katli int bir array'de ki en büyük ve en kücük
        //sayiyi bulup yazdiran bir method olusturun.

        int[][] arr = {{3, 6, 8}, {2, 5, 9}, {1, 3}, {12, 23, 24}};

        enBuyukEnkucukYazdir(arr);  // En kücük sayi: 1   En büyük sayi: 24
    }
    public static void enBuyukEnkucukYazdir (int[][] arr){

        int enKucukSayi = arr[0][0];
        int enBuyukSayi = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                //arr[i][j]

                if (arr[i][j] < enKucukSayi){
                    enKucukSayi = arr[i][j];
                }
                if (arr[i][j] > enBuyukSayi){
                    enBuyukSayi = arr[i][j];
                }

            }

        }
        System.out.println("En kücük sayi: " + enKucukSayi);
        System.out.println("En büyük sayi: " + enBuyukSayi);

    }
}

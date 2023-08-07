package day26_forEachLoop_constructer;

public class C01_EnBuyukElementiBulma {
    public static void main(String[] args) {


        //Arrayin elementlerinden en büyük olani bulun

        int[] arr = {3, 6, 9, 1, 3, 7, 12, 34, 23, 87, 35, 43};

        int enBuyukElement = arr[0];

        for (int each: arr //Arrayda ki her int elementi getir
             ) {

            if (each>enBuyukElement){
                enBuyukElement = each;
            }
        }
        System.out.println("Arraydeki en buyuk element: " + enBuyukElement); //87

    }
}

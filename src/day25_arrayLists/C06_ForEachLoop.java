package day25_arrayLists;

public class C06_ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {20,30,5,45};

        //Array'in tüm elementlerini toplayin
        //Array'in tüm elementlerini yazdirin
        //Array'in elementlerinden cift sayi olanlari yazdirin.
        //Array'in elementlerinden en büyük olani  bulun.

        /*
        Arrayin tüm elementlerini gözden gecirmemiz gereken sorularda for loop kullaniriz.

        For lopp'un en önemli özelligi index sayesinde
        tüm elementleri 0. index'den sonuncu index'e kadar
        sirali olarak getirmesidir.

        ama yukaridaki sorularda elementi sirasiyla getirmesinin hic bir önemi yok.

        Index'in yani sirali getirmenin önemli olmadigi durumlarda for loop yerine for-each loop kullaniriz.

         */

        for (int each: arr
             ) {
            System.out.print(each+" "); //20 30 5 45 //verilen index sirasiyla getireceginin garantisi yoktur ama.
        }




    }
}

package day15_nestedForLoop_MethodOlusturma;

public class C01_NestedForLoop {
    public static void main(String[] args) {
        /*
        Asagida ki tabloyu konsolda yazdirin

        1  2  3  4
        2  4  6  8
        3  6  9  12

        eger yazdirilacak sekil dikdortgen bicimindeyse
        ic ice for loop ile yapabiliriz
         */

        for (int i = 1; i <= 4; i++) {   //ilk satir
            System.out.print(i + "  ");
        }
        System.out.println("");  //bir alt satira inmesi icin
        for (int i = 1; i <= 4; i++) {
            System.out.print(i * 2 + "  "); //2. satir
        }
        System.out.println("");  //bir alt satira inmesi icin
        for (int i = 1; i <= 4; i++) {
            System.out.print(i * 3 + "  "); //3.satir
        }
        System.out.println("-------------------");

        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 4; i++) {
                System.out.print(i * j + "  ");
            }
            System.out.println(" "); //alt satira gectik ve basa donduk
        }

    }
}

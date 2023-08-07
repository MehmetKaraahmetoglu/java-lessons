package day06_concatenation_matematikselOperatorler;

public class C03_AndOperatoru {
    public static void main(String[] args) {

        System.out.println( 5>3 && 6>4); //  true && true  ==> true

        System.out.println( 5<3 && 6>4);  //false && true  ==>  false

        System.out.println( 5>3 && 6<=4);  //true && false  ==> false

        System.out.println(5<=3 && 6<=4);  //false && false ==> false


        /*and operatoru ile baglanan boolena ifadeler kac tane olursa olsun
         hepsi true ise sonuc true,
         bunun disindaki tum durumlarda false olur.

         bu yonuyle matematiksel carpmaya benzer.
         */

        //bir sayinin hem 2, hem 3 hem de 5 ile bolunebilmesi lazim.

        int sayi = 24;       //true   &&      //true     &&     //false  ==> false
        System.out.println(sayi % 2 == 0 && sayi %3 == 0 && sayi %5 == 0 );
        // üstteki ilk kisim mesela, sayinin 2 ile bolumunden kalan 0 olmali demek

        //sayi 0 veya daha buyuk ve 100 veya daha kucuk olmalidir.
        //sayi 0 ile 100 arasinda olmalidir.(0 ve 100 dahil)

        System.out.println(sayi>=0 && sayi<=100);
                        // true  &&     true  ==>true


    }
}

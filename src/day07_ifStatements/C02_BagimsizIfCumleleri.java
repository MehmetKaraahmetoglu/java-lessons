package day07_ifStatements;

public class C02_BagimsizIfCumleleri {
    public static void main(String[] args) {
        /*
        Dikkat edilecekler
        1- Eger boolean sarttan sonra süslü parantez kullanilmazsa
            Java if body'si olarak ilk ; kadar olan bolumu alir
            digerleri if bodysinin disinda kalir.
        2- If cumlesinde {} kullanmaz ve boolean sartin sonuna ; yazarsaniz
            if cumlesi hic bir islem yapmaz
            Cünkü body'si yoktur.
        3- Özetle if body'si tek satirdan olusuyorsa  {} kullanmasanizda olur.
           ancak if body'si birden fazla satirdan olusuyorsa  MUTLAKA {} kullanmalisiniz.
         */
        int a = 35;
        int b = 30;

        if (a<b){
            System.out.println("a, b'den kucuk 1");
            System.out.println("a, b'den kucuk 2");
            System.out.println("a, b'den kucuk 3");
        }

        if (a % 2 ==0 )
            System.out.println("a 2 ile tam bolunuyor 1"); //ilk ; e kadar olan kisim if body'sidir
            System.out.println("a 2 ile tam bolunuyor 2"); //sonraki satirlarin if ile alakasi yoktur.
            System.out.println("a 2 ile tam bolunuyor 3");

    }
}

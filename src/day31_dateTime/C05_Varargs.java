package day31_dateTime;

public class C05_Varargs {
    public static void main(String[] args) {

        toplama(3,5); // Iki int sayinin toplami: 8
        toplama(3,5,7); // Uc int sayinin toplami: 15
     /*
            int... uzunlugu esnek bir array olan varargs'i temsil eder
            argument olarak kac tane int verirsek verelim
            varargs hepsini bir array olarak bunyesine alir
         */
    }
    public static void toplama(int... sayi){
        int toplam=0;
        for (int i = 0; i < sayi.length ; i++) {
            toplam += sayi[i];
            //Arrayler de oldugu gibi for loop yapisi ile toplatiyoruz
        }
        System.out.println("Verilen int sayilarin toplami : " + toplam );
    }
}

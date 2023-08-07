package day18_whileLoop_DoWhileLoop;

public class C07_DoWhileLoop {
    public static void main(String[] args) {

        /*
        3 cesit loop gördük
        hepsinin avantajlari ve dezavantajlari var

        1- for  loop baslangic ve sonucu belirli sayi olan durumlarda
            veya kac kere tekrar edecegimiizi bildigimiz durumlarda avantajli

        2- while loop; kac kere tekrar edecegini bilmedigimiz
            islemleri yapmak icin avantajli

        3- do-while loop, kullanicidan deger alarak yaptigimiz islemlerde
            ilk deger atamasini kod yazan kisinin degil de
            kullanicinin yapmasi acisindan avantajli.
             
         */


        int bas = 30;
        int bit = 20;
        int toplam = 0;

        //while loop ile baslangic degeri ile bitis degeri arasinda ki
        //sayilari toplayip yazdirin (sinirlar dahil)
        //baslangic degeri bitis'ten buyukse, toplama olmamali

        while (bas <= bit) {

            toplam += bas;
            bas++;
        }
        System.out.println("While loop ile aradaki sayilarin toplami : " + toplam);


        //simdi de do while  loop ile yapalim

        bas = 30;
        bit = 20;
        toplam = 0;

        do {
            toplam += bas;
            bas++;
        } while (bas <= bit);


        System.out.println("Do while loop ile aradaki sayilarin toplami : " + toplam);


    }
}


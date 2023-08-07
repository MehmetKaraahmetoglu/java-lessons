package day02_dataTurleri_variable;

public class C03_primitivDataTruleri {
    public static void main(String[] args) {

        // Boolean: Mantiksal degerler alan true ve false kabul eder.
        boolean bl1= true;
        boolean bl2= false;

        char ch1 = 'a';
        char ch2 = '2';
        //char ch3 = 'as'  Tek tirnak icinde tek karakter kullanmak gerekiyor Char icin.

        //Turkiye'de sehir nufuslari tutmak istiyoruz.

        int nufus = 834250 ;
        int nufusBilecik= 30000;

        //ikiside Int oldugu icin hafizada kapladigi yer ayni. onemli olan data turudur.

        //Bir sehirdeki noter sayisini tutacagiz.
        short noterSayisiIstanbul = 456;

        float fl1 = 20f;
        float fl2 = 6f;
        float fl3 = fl1 / fl2 ;

        System.out.println(fl3);

        double db1=20;
        double db2=6;
        double db3=db1/db2;

        System.out.println(db3);

        //double bölme islemlerinde 0,000000001 gibi bir hata yapabilir.
        // 20/5= 3,99999999999 gibi

        String str= "HelloWorld";

        System.out.println(str);

        //verilen iki sayiyi carpip sonucu yazdirin.

        int sayi1=10;
        int sayi2=20;

        System.out.println("Verilen iki sayinin carpimi : " + sayi1*sayi2);


    }
}

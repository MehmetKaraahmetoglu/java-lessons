package day02_dataTurleri_variable;

public class C04_StringDataTuru {
    public static void main(String[] args) {
        int sayi=20;

        String isim ="Mehmet Emin Karaahmetoglu";

        System.out.println(isim.toUpperCase()); //touppercase tüm harfleri buyuk yazmak icin

        System.out.println(isim.toLowerCase());  //tolowercase de kücük yazdirir.

        System.out.println(isim); // yukarda cift tirnak icinde ne varsa onu getirir

        String str1 = "java ";
        String str2 = "candir";

        System.out.println(str1 + str2);  //iki tanee string "+" isareti ile toplanmaya calisilirsa java o kelimeyi
                                        // birlestiir.
        //str 1 den sonra 1 bosluk birakirsak otomatik olarak bosluk birakilir.

        String str3 = "30";
        String str4 = "40";

        System.out.println(str3+str4); //burda 3040 yanyana sonuc verir


        //Verilen isim ve soyismi
        //Girilen ali uzunkavak database'e kaydedildi.
        //seklinde yazdirin.

        String ad= "Ramazan";
        String soyadi= "Tatar";

        System.out.println("Girilen " + ad + " "+ soyadi +" database'e kaydedildi." );
        //cift tirnaklarin arasi bos cunku metinde arada  bosluk olmasi lazim. Cift tirnak icindeki bosluklar metne yansir.
        //ancak kodlar arasinda birakilan bosluklar metne yansimaz.

        
    }
}

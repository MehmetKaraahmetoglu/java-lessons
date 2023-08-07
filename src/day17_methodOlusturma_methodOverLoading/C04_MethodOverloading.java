package day17_methodOlusturma_methodOverLoading;

public class C04_MethodOverloading {

    /*
    Biz bir method Call yaptigimizda Java oncelikle
    method ismini kontrol eder.
    Sonra argument olarak verilen degerler ile, parametre olarak yazilan variable'larin data türlerini karsilastirir
    (method olustururken baslikta yayanlar)
    ve uyumlu ise method'u calistirir
    Argumentler ile parametreler uyumlu degilse CTE(hata) verir.

    Java'da ayni data türüne ve parametre sayisina sahip
    birden fazla method olusturamazsiniz.

    Farkli data türlerinde parametreler varsa
    dizilis degistirildiginde
    java farkli bir method olarak kabul eder
     */
    public static void main(String[] args) {

        toplama(4, 6); // iki int toplami:10

        toplama(4, 5.5); //int ile double'in toplami: 9.5

        toplama(5.3, 6);  //double ve int'in toplami: 11.3

        toplama(4.3,2.4); //double ve double'in toplami: 6.699999999999999

        toplama(3.4f,5);
        //float icin method olusturmadik ama sonuc aliriz. Cunku double floati kapsar
        //bizde double ile method olusturdugumuz icin sorun olmaz
        // double ve int'in toplami: 8.400000095367432

        toplama(2.3f,5f); // double ve double'in toplami: 7.299999952316284


    }

    public static void toplama(int sayi1, int sayi2) {  //toplama int int
        System.out.println("iki int'in toplami: " + (sayi1 + sayi2));

    }

    public static void toplama(int a, double b) { // toplama int double
        System.out.println("int ile double'in toplami: " + (a + b));
    }

    public static void toplama(double b, int a) { // toplama double int
        System.out.println("double ve int'in toplami: " + (a + b));
    }

    public static void toplama(double sayi1, double sayi2) { //toplama double double
        System.out.println("double ve double'in toplami: " + (sayi1+sayi2));
    }
    /*
    method ismi + parametrelerin data türlerine method signature denir.(isim dataturu dataturu)
    Java ayni class'da signature'i ayni olan 2 methoda izin vermez

    Bir class'da ismi ayni fakat signature'i farkli birden fazla method olusturulmasina METHOD OVERLOADING denir.

     */
}

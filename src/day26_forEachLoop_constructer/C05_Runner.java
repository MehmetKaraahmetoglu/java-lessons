package day26_forEachLoop_constructer;

import java.util.*;

public class C05_Runner {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Set<Integer> ogrenciListesi = new HashSet<>();
        String str = new String("Java candir.");


        //yukaridakiler gibi...
        C04 obje = new C04();
        //C04 = classadi/ data türü
        // obje = isim
        //new = yeni bir obje olusturmak icin gerekli kelime
        //04 = constructor

        System.out.println(obje.hiz); // 0 c04 de atama yapmadik
        System.out.println(obje.kapasite); // 0 c04 de atama yapmadik
        System.out.println(obje.ogrenciIsmi); // null cünkü atama yapmadik c04 de
        System.out.println(obje.sayi); //10
        obje.method1(); // method1 calisti ( C04 de bu sekilde yazdik cunku)

    }

    /*
    Herhangi bir classin icinden
    baska bir class'da ki class üyelerine(variable, method vb)
    ulasmak isterseniz
    hedef class'dan bir obje olusturabilirsiniz

    Java'da bir class'dan bir obje olusturmak istediginizde MUTLAKA
    bir constructor calisir.

    Java da objeler class'lardan üretilir.
    class'larda obje üretilebilmesi icin CONSTRUCTOR olmalidir.
    Java bunu bildigi icin, olusturulan her class'a obje olusturulmasini saglayan
    DEFAULT CONSTRUCTOR yerlestirir.

    default constructor GORüNMEZ
    parametresizdir ve body'sinde kod yoktur.

    ÖNEMLI:
    Bir class'da görünür bir constructor yoksa
    o class'da default constructor vardir.
    Görünür bir onstructor varsa,
    Java default constructor'i siler.







    default kelimesi birlikte kullanildigi kelime ile anlam kazanir.
    default deger : class levelde olusturulan variable'lara
                    biz deger atamazsak Java default deger atar.
    default case  : Switch statement'da hic bir case ile uyumlu olmayan
                    degerler icin tanimlanan kodlardir.
    default access modifier : icinde bulunulan class, ve icinde bulunulan package'dan
                              erisilebilen class uyelerini belirler.
    default constructor : bu dersin konusu.olusturulan her class'a obje olusturulmasini saglayan
                           DEFAULT CONSTRUCTOR

     */
}

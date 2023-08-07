package day11_stringManipulations;

public class C03_substring {
    public static void main(String[] args) {

        String str = "Java Candir";

        /*
        substring()'u bize verilen bir stringin istenen parcasini alma imkani tanir.

        2  türlü kullanimi vardir
        1) baslangic indekx'ini verirseniz, o indexten sona kadar olan kismi verir
        2) baslangic ve bitis index'lerini verirseniz
        baslangic index'inden(dahil) baslar
        bitis index'ine kadar (haric)aradaki karakteri yazdirir
         */

        System.out.println(str.substring(3));  // a Candir
        System.out.println(str.substring(7));  // ndir
        System.out.println(str.substring(0));  // Java Candir
        //System.out.println(str.substring(15));  // sinirlarin disinda deger veremeyiz

        //Java Candir
        System.out.println(str.substring(3,6));   // a C
        System.out.println(str.substring(5,10));  // Candi
        System.out.println(str.substring(1,2));  // a
        System.out.println(str.substring(6,7));  // a

        //bu yazim bize istenen index'deki tek bir elementi verir.
        //charAt()'e benzer ama arti bir özelligi var
        //substring bize String verdigi icin manipulation yapmaya devam edebiliriz

        // 6.index'deki harfi buyuk harf olarak yazdirin

        System.out.println(str.substring(6,7).toUpperCase());

        System.out.println(str.substring(3,3)); //hiclik yazdirir

        //System.out.println(str.substring(8,5)); //sonradan baslayip geriye dogru gitmez



        //son 3 harfi yazdirin

        System.out.println(str.substring(str.length()-3)); // dir
        System.out.println(str.substring(str.length()-1));  // r

        String str1 = "java";
        String str2 = " ";
        String str3 = "candir";

        System.out.println(str1+str2+str3);  //java candir

        System.out.println(str1.concat(str2).concat(str3));
    }
}

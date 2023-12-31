package day12_StringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String str = "Javayi ogrenecegiz, baska yolu yok";

        //a'harfinin ilk kullanim indexini yazdirin

        System.out.println(str.indexOf("a"));

        //a harfinin son kullaniminin indexini yazdirin

        System.out.println(str.lastIndexOf("a"));  // 24

        //  J harfinin ilk indexini yazdirin

        System.out.println(str.indexOf("J")); // 0

        // J harfinin son kullaniminin indexini yazdirin

        System.out.println(str.lastIndexOf("J")); // 0

        //Metne bakmadan e harfinin 2 kere veya daha fazla kullanilip kullanilmadigini yazdirin

        int ilkIndex = str.indexOf("e");
        int sonIndex = str.lastIndexOf("e");

        if (ilkIndex == -1){
            System.out.println("hic e kullanilmamis");

        }else if (ilkIndex == sonIndex){
            System.out.println("Sadece bir kere kullanilmis");

        }else {
            System.out.println("e harfi 2 kere veya daha fazla kullanilmis");
        }

        //"Javayi ogrenecegiz, baska yolu yok"

        //o harfinin son indexini yazdirin
        System.out.println(str.lastIndexOf("o"));  //32

        //o harfinin son kullanimdan bir onceki kullaniminin indexini yazdirin

        System.out.println(str.lastIndexOf("o", 31));  //27

        //k harfinin son indexini yazdirin

        System.out.println(str.lastIndexOf("k"));    //33
    }
}

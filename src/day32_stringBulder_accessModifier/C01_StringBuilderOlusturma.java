package day32_stringBulder_accessModifier;

public class C01_StringBuilderOlusturma {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder(); //Bu sekilde builder olusturabiliriz. Bunun en önemli özelligi
        //degistirilebilir olmasi. Yani method ile atama yaparak degistiriebiliriz.

        System.out.println(sb1); //Hiclik yazdirdi.
        System.out.println(sb1.length()); //0
        System.out.println(sb1.capacity()); // 16 Karakterlik

        StringBuilder sb2 = new StringBuilder("Java Candir.");
        System.out.println(sb2); //Java Candir
        System.out.println(sb2.length()); //12
        System.out.println(sb2.capacity()); // 12+16= 28 Karakterlik

        StringBuilder sb3 = new StringBuilder(9); //istedigimiz kapasitede bir StringBuilder olusturma
        System.out.println(sb3); //hiclik yazdirdi
        System.out.println(sb2.length()); //0
        System.out.println(sb2.capacity()); //9 karakterlik

        //.append icine metin ekler
        sb3.append("Java Candir.");
        System.out.println(sb3); //Java Candir.
        System.out.println(sb3.length()); //12
        System.out.println(sb3.capacity()); //20 karakterlik

        sb3.trimToSize(); // kpasite ile length'i esitler
        System.out.println(sb3); //Java Candir.
        System.out.println(sb3.length()); //12
        System.out.println(sb3.capacity()); //12 karakterlik
    }
}

package day32_stringBulder_accessModifier;

public class C04_BaskaObjelerleKarsilastirma {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1==sb2); // false cünkü obje olustururken referenslari farkli oldu
        System.out.println(sb1.equals(sb2)); // false

        //StringBuilder'da equals methodu yerine compareTo() kullanilir.
        System.out.println(sb1.compareTo(sb2)); // 0 , eger ayni ise 0 verir
    }

}

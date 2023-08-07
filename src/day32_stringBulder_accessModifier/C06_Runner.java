package day32_stringBulder_accessModifier;

public class C06_Runner {
    public static void main(String[] args) {

        C05 obj = new C05();

        // System.out.println(obj.privateSayi);
        // Private class üyelerine  baska classtan ulasma sansimiz yok.

        System.out.println(obj.defaultSayi); // 0
        obj.defaultSayi=20;
        System.out.println(obj.defaultSayi); // 20

        System.out.println(obj.protectedSayi); // 0
        obj.protectedSayi=30;
        System.out.println(obj.protectedSayi);// 30

        System.out.println(obj.publicSayi);
        obj.publicSayi=40;
        System.out.println(obj.publicSayi); //40
    }
}

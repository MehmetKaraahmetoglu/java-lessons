package day12_StringManipulations;

public class C03_isEmpty_isBlank {
    public static void main(String[] args) {

        String str1 ="";
        String str2 =" ";
        String str3 ="   .    ";

        System.out.println(str1.isEmpty()); //str1 bos mu? true
        System.out.println(str2.isEmpty()); // bosluk var  False

        System.out.println(str1.isBlank());  //spacelerden mi olusuyor. Hiclik icin true verir True
        System.out.println(str2.isBlank());  // true

        System.out.println(str3.isEmpty());  // false
        System.out.println(str3.isBlank());  //  false
    }
}

package day11_stringManipulations;

public class C07_indexOf {
    public static void main(String[] args) {

        String str = "Ali topu at, at ali at";

        //Ali'nin baslangic index'i nedir?   0
        System.out.println(str.indexOf("Ali"));

        //at'in baslangic  indexi nedir?    9
        System.out.println(str.indexOf("at"));


        //op'un baslangic index'i nedir?  5
        System.out.println(str.indexOf("op"));

        System.out.println(str.indexOf('a'));  // 9

        System.out.println(str.indexOf("a",10));  //13

        System.out.println(str.indexOf("yusuf")); //  -1 ( -1 olunca yok oldugunu anlariz.)


    }
}

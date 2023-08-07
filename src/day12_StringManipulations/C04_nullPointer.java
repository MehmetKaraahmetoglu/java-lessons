package day12_StringManipulations;

public class C04_nullPointer {
    public static void main(String[] args) {

        String str1;

        //System.out.println(str1);
        //str1.concat(" candir");

        str1= "java";
        System.out.println(str1);   //java
        System.out.println(str1.concat(" candir"));  //java candir

        /*
        null bir deger degil pointerdir.(isaretleyici)
        26.satir icin
        str2'nin degeri null veya str2'ye null degeri atanmis ifadeleri yanlistir

        dogru olan ifade
        str2'ye deger atamadik, bunun farkindayiz ve  null olarak isaretledik
         */

        String str2 =  null;
        System.out.println(str2);  // null yani bir deger atanmamis
        System.out.println(str2 + " candir"); // null candir

        // System.out.println(str2.concat(" candir"));  // hata verdi(NullPointerException)

        String str3 = null;
        String str4 ="";
        System.out.println(str4.isEmpty());  //true
        System.out.println(str4.isBlank());  //true

        //System.out.println(str3.isBlank());  //NullPointerException deger yok olmaz diyor java
        //System.out.println(str3.isEmpty());   //NullPointerException hic bir degeri yoktur. ne bos ne hiclik,yok yani yok:)



    }
}

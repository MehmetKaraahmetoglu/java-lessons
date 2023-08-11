package day36_inheritanceDataTypeKullanimi;

public class KChildClass extends JParentClass{
    public void method1(){
        System.out.println("Child class method1");
    }

    @Override
    public void method2() {
        super.method2();

        /*
        @Override notasyonu override method ile overriding method'u
        birbirine baglar
        eger overriden method silinirse
        CTE verir.(Parent classinda ki method2 silinirse
        CTE verir yani.)

        Kullanmak zorunda degiliz
        ama iki method'u bagimli yapmak istiyorsak kullanilabilir.

        Overriding method varken
        overridden method calismaz

        EGER her iki methodu birden calistirmak istersek
        child class'daki overriding method'a
        super.method(); ekleyebiliriz
         */
    }
}

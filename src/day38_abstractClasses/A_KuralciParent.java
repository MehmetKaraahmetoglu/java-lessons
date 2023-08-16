package day38_abstractClasses;

public abstract class A_KuralciParent {
    public void method1(){
        System.out.println("parent method 1");
    }
    public void method2(){
        System.out.println("parent method 2");
    }
    public abstract void method3(); // bodysi olmaz, childda olucak
    public abstract void method4();
    public abstract void  method5();

    /*
    Eger parent class'i child class'lar icin bir cati class yapiyorsak
    ve parent class'a extends yapan tum child class'larin bazi method'lari
    kendisine uyarlamaya MECBUR ETMEK istiyorsak ABSTRACTION kullaniriz

    1- Bi class'in bu ozellikleri saglamasi icin abstract omasi lazim.
        - Abstract (Kismi abstraction)
            Bazi methdlari child'larin uyarlamasini mecbur eder
            bazilarini serbest birakir.
        - Interface (Full abstraction)
            Tüm methodlari child'larin kendisine uyarlamasina mecbur eder.
    2- Bir class'i abstract(Kural koyan, mecbur tutan) class yapmak isterseniz
    deklerasyonuna abstract yazmalisiniz
    3- Child class'larin mecburen uyarlamasini istedigimiz methodlari abstract method yapiyoruz.
       Mecburen uyarlanmasini istemedigimi, karari child class'a biraktigimiz methodlari
       bu güne kadar yaptigimiz sekilde birakiyoruz.
     */

}

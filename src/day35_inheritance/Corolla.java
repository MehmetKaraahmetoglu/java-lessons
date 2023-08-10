package day35_inheritance;

public class Corolla extends BToyota {

    Corolla(){

        System.out.println("Corolla parametresiz constructor calisti");
    }

    Corolla(String str){
       // görünmeyen super(); var
       // Javanin koydugu ve görünür olmayan
        // Constructor call HER ZAMAN parametresiz olan
        // super(); 'dur
        //Kodu yazan kisiler isterlerse ilk satira baska
        // Construcot call yazabilirler.
        // eger ilk satirda görünür bir constructor call varsa
        // java default olarak koydugu super constructor call'i siler.

    }
    String uretimYeri = "Sakarya / Turkiye";
    String model = "Corolla";
    String aku ="Inci aku";
    String sanzimanTuru = "Cvt";

    public static void main(String[] args) {

        Corolla corolla = new Corolla();

        Corolla corolla1 = new Corolla("Kirmizi");

        //Bir objenin bir class'da olusturulan özelliklere ulasmasi ve
        //o classta atanan ilk degerlere sahip olmasi icin
        //o class'larin constructor'lari calismak ZORUNDADIR:

        // Extends keyword kullanilan bir class'ta olusturulan her CONSTRUCOR'in
        // ilk satirinda biz görsek de görmesek de
        // CONSTRUCTOR CALL vardir.
        // Eger ilk satirda görünür bir constructor call yoksa
        // Javanin koydugu görünmeyen süper(); (parametresiz) call vardir.

    }
}

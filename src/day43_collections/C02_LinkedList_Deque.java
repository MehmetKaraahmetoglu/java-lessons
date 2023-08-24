package day43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList_Deque {
    public static void main(String[] args) {
        /*
        Deque: double ended queue demektir.Yani cift basli kuyruk.
        Iki bastan da islem yapildigi icin pekcok methodun first ve last seklinde versiyonu olur
         */
        Deque<String> isimler = new LinkedList<>();
        isimler.add("Cemil"); // Basa yada sona demezsek sona ekler. List'deki add gibi
        isimler.addFirst("Resul"); //en basa ekler

        System.out.println(isimler); //[Resul, Cemil]
        isimler.addLast("Mehmet");//en sona ekler
        System.out.println(isimler); //[Resul, Cemil, Mehmet]

        //removeFirstOccurrence: benden bir isim ister ve ilk buldugu o ismi siler.
        isimler.addLast("Resul");
        isimler.add("Eyyüp");
        isimler.add("Kaan");
        System.out.println(isimler); //[Resul, Cemil, Mehmet, Resul, Eyyüp, Kaan]

        System.out.println(isimler.removeLast()); // bu satirda sildigi elementi yazdirir   Kaan
        System.out.println(isimler);//[Resul, Cemil, Mehmet, Resul, Eyyüp]
        System.out.println(isimler.removeLastOccurrence("Resul")); //true (resulün sonn kullanimini sildi)
        System.out.println(isimler.removeLastOccurrence("Hilal")); // false cünkü listede Hilal yok

        System.out.println(isimler.pollFirst());// Resul'ü sildi ve bana sildigi element olan Resulü döndürdü
        //eger liste bossa null döndürecek
        System.out.println(isimler.pop());// Ilk elementi siler ve size döndürür, yani Cemil'i ama eger liste bossa
        //NoSuchElement exception firlatir.
        System.out.println(isimler); //[Mehmet, Eyyüp]

        System.out.println(isimler.offerFirst("Bugra"));//True   aBelrtilen eleenti ilk siraya ekler.Addfirt'den farki
        // addfirst her halükarda ekler ama offerFirst dersek kapasite sinirlamasi yoksa ekler.
        System.out.println(isimler);//[Bugra, Mehmet, Eyyüp]

        System.out.println(isimler.peekFirst());//Bugra   Bize ilk elementi getirir ama silmez, liste bos olsaydi null
        System.out.println(isimler); //[Bugra, Mehmet, Eyyüp]

        System.out.println(isimler.element());//Bugra yukarda ki peek ile ayni islevi görür tek fark eger liste bossa Exception firlatir
        System.out.println(isimler); //[Bugra, Mehmet, Eyyüp]

        System.out.println(isimler.hashCode()); //275682895 bu listeye karsilik verilen kod

        isimler.clear();

        System.out.println(isimler.hashCode()); // bos oldugu icin 1 verdi

        isimler.add("Kahraman");
        System.out.println(isimler.hashCode()); //841010808

    }
}

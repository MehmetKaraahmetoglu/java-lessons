package day43_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList_List {
    public static void main(String[] args) {

        List<String> isimler = new LinkedList<>();
        isimler.add("Omer");
        isimler.add("Cemil");
        isimler.add("Nergiz");

        List<String> ikinciList = new LinkedList<>();
        ikinciList.add("Mustafa");
        ikinciList.add("Cemil");

        System.out.println(isimler.retainAll(ikinciList)); // true
        //Ortak elemanlar disindaki tüm elemanlari siler, yani sadece kesisim elemanlar kalir.

        System.out.println(isimler); // [Cemil]

        System.out.println(ikinciList); // [Mustafa, Cemil]

        ikinciList.retainAll(isimler);
        System.out.println(ikinciList); //[Cemil]

    }
}

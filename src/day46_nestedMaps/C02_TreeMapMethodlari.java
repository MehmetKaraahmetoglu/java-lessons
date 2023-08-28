package day46_nestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_TreeMapMethodlari {
    public static void main(String[] args) {
        TreeMap<String,Integer> harfler = new TreeMap<>();
        //Data türünü parent class dan secersek parentin tüm childlerinda olan
        //ozelliklerini görürüz
        //ama data türünü const ile ayni yaparsak artik treeMap'e özel olan methodlari görebiliriz

        harfler.put("K",25);
        harfler.put("L",10);
        harfler.put("T",5);
        harfler.put("Z",50);
        harfler.put("A",15);

        System.out.println(harfler); // {A=15, K=25, L=10, T=5, Z=50}

        System.out.println(harfler.tailMap("L"));// L dahil sonraileri veriri. fromTail
        //{L=10, T=5, Z=50}
        System.out.println(harfler.tailMap("C")); //Olmayan harf yazdik. C olsaydi adan sonra olurdu, olmadigi icin
        //sonrakileri yazdirdi.
        //{K=25, L=10, T=5, Z=50}
        System.out.println(harfler.tailMap("L", false));// L dahil olmasin istersek boolean kismina false yazariz
        //{T=5, Z=50}
        System.out.println(harfler.headMap("T")); //Bu sefer bastan baslar ve verilen harfe kadar gider ve verilen harf dahil degil
        //Javada bitis degerleri dahil olmaz!!
        //{A=15, K=25, L=10}
        System.out.println(harfler.headMap("M")); //M yok ama olsaydi diye düsünüp olacagi yere kadar yazdirir
        //{A=15, K=25, L=10}
        System.out.println(harfler.headMap("T",true)); // dahil olmasini istersek voolen kismina true yazariz
        //{A=15, K=25, L=10, T=5}
        System.out.println(harfler.headMap("M",true));
        // {A=15, K=25, L=10}

        // {A=15, K=25, L=10, T=5, Z=50}
        System.out.println(harfler.ceilingKey("K")); // K K'ya esit yada buyuk olanlar arasindan K yi döndürdü
        System.out.println(harfler.ceilingKey("N")); // T N olsaydi L ile T arasinda olurdu..
        System.out.println(harfler.ceilingKey("U")); // Z

        System.out.println(harfler.higherKey("K")); // L yukardakinden farki esitik yok bir sonrakini verdi
        System.out.println(harfler.ceilingKey("N"));// T
        System.out.println(harfler.ceilingKey("U"));// Z

        System.out.println(harfler.ceilingEntry("K")); // K=25
        System.out.println(harfler.higherEntry("K")); // L=10 K dan büyük olanlar arasinda en kücük

        // {A=15, K=25, L=10, T=5, Z=50}
        System.out.println(harfler.floorKey("K"));//K Verilen keye esit yada kücük olanlar icinde en büyügünü getirecek
        System.out.println(harfler.floorKey("M"));//L Olmayan bir deger girildeiginde olacagi muhtemel yeri baz alir

        System.out.println(harfler.lowerKey("K"));// A kucuk
        System.out.println(harfler.lowerKey("M"));// L

        // {A=15, K=25, L=10, T=5, Z=50}
        System.out.println(harfler.pollFirstEntry()); //A yi silicek ve bize döndürecek
        System.out.println(harfler); //{K=25, L=10, T=5, Z=50}

        System.out.println(harfler.pollLastEntry()); // Sonuncuyu silecek ve bize delil olarak getirecek
        System.out.println(harfler); // {K=25, L=10, T=5}

        System.out.println(harfler.descendingKeySet()); // Siralamayi tersine cevirerek verdi
        // [T, L, K]
        System.out.println(harfler.descendingMap());
        //{T=5, L=10, K=25}

        // harfler = harfler.descendingMap(); // kabul etmez cünkü Treemapde olusturduk, bu sekilde oldugunda dogal sirali
        //olmaktan cikacagi icin java bunun ltini cizer.

    }
}


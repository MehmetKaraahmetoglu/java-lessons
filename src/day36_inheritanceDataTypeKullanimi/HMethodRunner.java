package day36_inheritanceDataTypeKullanimi;

public class HMethodRunner {
    public static void main(String[] args) {

        GAvciKuslar avciKusKartal = new GAvciKuslar();
        // constructor ve data türü ayni ise ilk bulunan deger gecerlidir.
        avciKusKartal.hareket();// G ucarlar
        avciKusKartal.beslenme();//GC et yer
        avciKusKartal.pence();// G pencelidir
        avciKusKartal.gaga();// G sivri gagalidir
        avciKusKartal.kanat();// F kanatlidir
        avciKusKartal.solunum();// F Akciger
        avciKusKartal.cogalma();// F yumurtayla
        avciKusKartal.omur();// E yasar ve olurler


        FKuslar kusKartal = new GAvciKuslar();
        // constructor ve data türü ayni degil ise
        // aramaya data türü olan classdan baslanir ve bulunamazsa CTE verir.
        // bulunursa, bulunan classtan constructor'in oldugu class'a kadar
        // bu ozelligin daha guncel hali var mi diye kontrol edilir
        // ve varsa en güncel hali yazilir.
        kusKartal.hareket();// G ucarlar
        kusKartal.beslenme();// G et yer
        // kusKartal.pence(); B veya A'da yok o sebeple cte(C'de olmai anlamli degil cunku baslanan yerde yoksa güncel varmi diye bakmaz)
        kusKartal.gaga();// G sivri gagalidir
        kusKartal.kanat();// F kanatlidir
        kusKartal.solunum();// F Akciger
        kusKartal.cogalma();// F yumurtayla
        kusKartal.omur();// E yasar ve olurler


        EHayvanlar hayvanKartal= new GAvciKuslar();
        hayvanKartal.hareket(); // G ucarlar
        hayvanKartal.beslenme(); // G et yer
        //hayvanKartal.pence(); // E'de olmadigi icin CTE
        //hayvanKartal.gaga(); // E'de olmadigi icin CTE
        //hayvanKartal.kanat(); // E'de olmadigi icin CTE
        hayvanKartal.solunum(); // F Akciger
        hayvanKartal.cogalma(); // F Yumurtayla
        hayvanKartal.omur(); // E yasar ve olurler
    }

}

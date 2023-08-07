package day15_nestedForLoop_MethodOlusturma;

public class C06_KendiSubStringimiz {
    public static void main(String[] args) {

        String str = "Java Candir.";
        int baslangic = 3;
        int bitis = 7;

        /*
        Verilen String ve baslangic,bitis degerlerini dikkate alarak
        1- bitis degeri baslangic degerinden kucukse hata mesaji yazdirin
        2- baslangic veya bitis degerleri index degerleriyle uyusmuyorsa hata mesaji verin
        3- degerler uygunsa baslangic index'i´nden(dahil), bitis index'ine(haric) kadar
            karakterleri yazdirin
         */

        if (baslangic > bitis){
            System.out.println("Baslangic degeri, bitis degerinden buyuk olamaz.");
        }else if (baslangic  < 0 || bitis < 0 || baslangic >= str.length() || bitis >= str.length()){
            System.out.println("Indexler hatali");
        }else{
            for (int i = baslangic; i <bitis ; i++) {
                System.out.print(str.charAt(i));    //a Ca

            }
        }

        //daha kolayi var. Böyle bir method olusturulmus cunku.
        //Her seferinde tekrar tekrar yapmak yerine method kullanabiliriz

        System.out.println("");  //alt satira aldim
        System.out.println(str.substring(baslangic,bitis));

        str.substring(5);
        /*
        Bu method bize "Candir" döndürür
        ancak yazdirmazsak veya bir variable'a atamazsak
        bu method'un döndürdügü sonuc bir ise yaramaz.
         */
        String istenenStrBolumu = str.substring(5);  //kaydeder ama yazdirmaz
        System.out.println(str.substring(5));  //yazdirir ama kaydetmez
    }
}

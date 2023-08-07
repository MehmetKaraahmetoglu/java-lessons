package day21_arrays;

public class C07_EnUzunEnKisaKelimeYazdir {

    // Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

    public static void main(String[] args) {

        String[] isimler = {"Resul", "Omer", "Mehmet", "Ertugrul" };

        enUzunEnKisaYazdir(isimler);  // En uzun kelime: Ertugrul, En kisa kelime: Omer


    }

    public static void enUzunEnKisaYazdir(String[] isimler) {

        String enKisaKelime = isimler[0]; // sadece baslangic degeri olmasi icin atandi
        String enUzunKelime = isimler[0]; // sadece baslangic degeri olmasi icin atandi

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].length() > enUzunKelime.length()){
                enUzunKelime=isimler[i];
            }
            if (isimler[i].length() < enKisaKelime.length()){
                enKisaKelime = isimler[i];
            }

        }
        System.out.println("En uzun kelime: " + enUzunKelime);
        System.out.println("En kisa kelime: " + enKisaKelime);

    }
}

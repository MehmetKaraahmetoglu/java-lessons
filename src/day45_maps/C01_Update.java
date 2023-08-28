package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;

public class C01_Update {
    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF,
        // 102=Veli-Cem-10-K-TM,
        // 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM,
        // 106=Sevgi-Can-10-K-MF}

        // 105 numarali ogrencinin soyadini Han yapin
        ogrenciMap.put(105,"Sevgi-Han-11-M-TM");

        // 103 numarali ogrencinin sinifi T yapin
        ogrenciMap.put(103,"Ali-Cem-11-T-TM");

        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF,
        // 102=Veli-Cem-10-K-TM,
        // 103=Ali-Cem-11-T-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Han-11-M-TM,
        // 106=Sevgi-Can-10-K-MF}

        //Yukarda iki adet manuel degisim yaptik. Simdi kodlarla yapalim...
        /*
        map'de bir value'yu update etmek istersek
        1- Bilgiye ulasmak ciin yaptigimiz gibi adim adim value'yu array'e cevirmeliyiz
            -key ile value'yu cagiririz
            -Value'yu array'e ceviririz.
            -Array'de istedigimiz update'i yapariz.
        2- Bilgiye ulasmak icin parcaladigimiz value'yu yeni haliyle birlestiririz.
        3- key ile yeni value'yu kullanarak map' update ederiz.
         */


    }
}

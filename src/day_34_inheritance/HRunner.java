package day_34_inheritance;

public class HRunner {
    public static void main(String[] args) {

        GAvciKuslar avciKusKartal = new GAvciKuslar();

        // Avci kuslar classindan aldigi ozellikler
        avciKusKartal.hareket(); // ucarlar
        avciKusKartal.beslenme(); // et yerler
        avciKusKartal.pence(); //pencelidir
        avciKusKartal.gaga(); // sivri gagali

        //Kuslar classindan aldigi ozellikler
        avciKusKartal.kanat(); //kanatlidir
        avciKusKartal.solunum(); //akcigerle nefes alir
        avciKusKartal.cogalma(); // yumutayla cogalir

        //hayvanlar clasiindan aldigi ozellikler
        avciKusKartal.omur(); //yasar ve olurler
    }
}

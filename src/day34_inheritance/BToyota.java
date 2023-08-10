package day34_inheritance;

public class BToyota extends Araba{

    BToyota(){
        System.out.println("toyota parametresiz constructor calisti");
    }

    //parents classda'ki bazi ozellikleri update edebiliriz.
    String marka = "Toyota";
    String uretimYeri = "Toyota araclar Japonya ve Turkiye'de uretilir.";

    //parent class'da olmayan yeni ozellikler ekleyebiliriz.

    String lastik = "Tum toyota araclar Pirelli lastik kullanir.";
    String guvenlik ="Tum toyota araclar extra guvenlik icerir.";
    String fren ="Toyota araclar ABS fren sistemi kullanir.";


}

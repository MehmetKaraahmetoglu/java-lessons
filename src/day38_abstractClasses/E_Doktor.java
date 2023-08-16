package day38_abstractClasses;

public class E_Doktor extends D_Personel{
    @Override
    public void standartMaas() {
        System.out.println("Doktorlar icin standart maas 30.000 TL");
    }

    @Override
    public void mesai() {
        System.out.println("Doktorlar haftada 5 gün, günlük 6 saat mesai yapar.");
    }

    @Override
    public void yillikIzin() {
        System.out.println("Doktorlarin yillik 1 ay izni olur.");
    }

    @Override
    public void ozelSigorta() { //Bu methodu yukarda code icinden kendimiz getrdik. Mecburi olmasi gereken method degildir.
        System.out.println("Doktorlar 1000 TL katki payi ile full güvenlik sigortasi yaptirabilir.");
    }
}

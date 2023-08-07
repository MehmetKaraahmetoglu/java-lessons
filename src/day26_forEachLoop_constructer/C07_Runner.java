package day26_forEachLoop_constructer;

public class C07_Runner {
    public static void main(String[] args) {

        C04 obj;
        // deklarasyon vardir ama ete kemige burunmus bir obje yoktur

        new C04();
        //objeyi olusturduk ama sonraki satirlarda  kullanamayiz
        //cünkü bir objeye atayamadik.

        System.out.println(new C04().sayi); // 10

        C04 obj2 = new C04();
        //tam anlamiyla obje olusturduk
    }
}

package day17_methodOlusturma_methodOverLoading;

public class C06_WhileLoop {
    public static void main(String[] args) {

        //1'den 100'e kadar olan sayilari(sinirlar dahil)
        //forlopp ile hesaplayin


        int toplam = 0;
        for (int i = 1; i <= 100; i++) {
            toplam += i;
        }
        System.out.println("forloop ile toplam; " + toplam); //forloop ile toplam; 5050

        toplam = 0;
        int i = 1;
        while (i <= 100) {

            toplam += i;
            i++;
        }
        System.out.println("while loop ile toplam: " + toplam);  //while loop ile toplam: 5050


    }

}


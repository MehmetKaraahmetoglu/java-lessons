package day41_exceptions;

public class C05_ThrowKeyword {
    public static void main(String[] args) {
        /*
        throws : bir methodda exception olasiligi varsa
                ve bizde o exception'i handle etmek yerine
                sadece kodlarimizi calisir hale getirmek istiyorsak
                method signature'ina throws keyword ile olasi exception(lar)i yazariz.

        throw : method icinde istedigimiz bir satirda exception olusturmak icin kullanilir.
         */
        int sayi = 10;

        // sayi cift ise ilk 3 satiri pasa gecin

        try {
            if (sayi % 2 == 0){
                throw new RuntimeException(); //Kontrollü bir exception verdik burda
            }
            System.out.println("kod satiri 1");
            System.out.println("kod satiri 2");
            System.out.println("kod satiri 3");

        }catch (RuntimeException e){
            System.out.println("Sayi cift oldugu icin ilk 3 kod satiri atlandi.");
        }
        System.out.println("kod satiri 4");
        System.out.println("kod satiri 5");
    }
}

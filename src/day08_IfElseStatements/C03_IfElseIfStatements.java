package day08_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseIfStatements {
    public static void main(String[] args) {
        // Kullanicidan bir tam sayi isteyin
        // Sayi 3' e bolunuyorsa 3'un kati
        // sayi 5'e bolunuyorsa 5'in kati
        // ikisine birden bolunuyorsa super sayi yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 ==0 && girilenSayi % 5 ==0 ){
            System.out.println("süper sayi");
        } else if (girilenSayi % 3 ==0) {
            System.out.println("3'ün kati");
        } else if (girilenSayi % 5 == 0){
            System.out.println("5'in kati");

        }
    }
}

package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C07_Ternary3 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi aliniz ve mutlak degerini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");

        double sayi = scanner.nextDouble();

        System.out.println(sayi>0 ? sayi :  -1*sayi);
    }
}

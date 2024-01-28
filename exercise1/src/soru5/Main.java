package soru5;

import java.util.Scanner;

public class Main {
    /*
    Soru5:
    if kullan
    Kullanicidan bir sayi girmesini isteyen ve girilen sayinin tek mi yoksa cift mi oldugunu belirleyen bir Java programini yazin.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        if(number%2==0) System.out.println("Girilen sayı çift sayıdır.");
        else System.out.println("Girilen sayı tek sayıdır");
    }
}

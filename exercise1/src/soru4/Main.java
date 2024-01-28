package soru4;

import java.util.Scanner;

public class Main {
    /*
    Soru4:
Switch-case kullanmadan gerekiyorsa if kullan

Basit Hesap Makinesi
Kullanicidan iki sayi girmesini isteyen ve ardindan bu iki sayi uzerinde toplama,
cikarma, carpma ve bolme islemlerini gerceklestiren bir Java programi yazin.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        double number1= scanner.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double number2= scanner.nextDouble();

        System.out.println("Toplamları: "+ (number1+number2));
        System.out.println("Farkları: "+ (number1-number2));
        System.out.println("Çarpımları: "+ (number1*number2));
        if(number2==0){
            System.out.println("Bölümleri: Tanımsız*");
            System.out.println("*: Bir sayıyı 0'a bölmek tanımsızdır.");
        }
        else System.out.println("Bölümleri: "+ (number1/number2));




    }
}

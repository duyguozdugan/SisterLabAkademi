package soru8;

import java.util.Scanner;

public class Main {
    /*
    Soru8:
Switch-case kullan
Kullanicdan iki deger alan ve kullanicinin toplama,cikarma,bolme,carpa islemlerinden birisini sectigi bir hesap makinesi uygulamasi yapin
     */

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        double number1= scanner.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double number2= scanner.nextDouble();
        System.out.println("+ : Toplama \n"+
                           "- : Çıkarma \n"+
                           "* : Çarpma \n"+
                           "/ : Bölme");
        System.out.print("Yapılacak işlemi seçiniz: ");
        String process= scanner.next();

        switch (process){
            case "+":
                System.out.println("Toplamı: "+(number1+number2));
                break;
            case "-":
                System.out.println("Farkı: "+(number1-number2));
                break;
            case "*" :
                System.out.println("Çarpımları: "+(number1*number2));
                break;
            case "/":
                if(number2==0) System.out.println("Bir sayı 0'a bölünemez.");
                System.out.println("Bölümleri: "+(number1/number2));
                break;
            default:
                System.out.println("Geçerli bir işlem giriniz.");

        }
    }
}

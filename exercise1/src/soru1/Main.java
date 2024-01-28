package soru1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Soru1:
Switch-case kullanmadan gerekiyorsa if kullan

kullanicidan alinan para degerinin KDV'li fiyatini ve KDV tutarini hesaplayip ekrana bastiran programi yazin.

KDV tutarini 30%

KDV'siz Fiyat = 10;

KDV'li Fiyat = 13;

KDV tutari = 3;*/
        Scanner scanner=new Scanner(System.in);
        System.out.print("Girilecek para miktarı: ");
        double money= scanner.nextDouble();
        System.out.println("Kdv'siz tutar: "+money);
        System.out.println("Kdv Tutarı: %30");
        double kdvTutari=(money*30)/100;
        money+=kdvTutari;
        System.out.println("Kdv tutarı: "+kdvTutari);
        System.out.print("Kdv'li tutar: "+money);


    }
}
package soru2;

import java.util.Scanner;

public class Main {
    /* Soru2:
    Switch-case kullanmadan gerekiyorsa if kullan
    Eger girilen tutar 0 ve 1000 TL arasinda ise KDV orani %10,
    tutar 1000 TL'den buyuk ise KDV oranini %22 olarak KDV tutari hesaplayan programi yaziniz.
    */

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Para tutarı: ");
        double money= scanner.nextDouble();

        if(money>=0 && money<=1000){
            System.out.println("Uygulanan KDV tutarı: %10");
            money+=(money*10)/100;
            System.out.println("KDV'li tutar: "+money);
        }
        else{
            System.out.println("Uygulanan KDV tutarı: %22");
            money+= (money*22)/100;
            System.out.println("KDV'li tutar: "+money);
        }

    }
}

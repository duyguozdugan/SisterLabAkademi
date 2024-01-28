package soru9;

import java.util.Scanner;

public class Main {
  /*
  Soru9:
  Switch-case kullan
  Kullaniciya hangi geometrik seklin alanini hesaplamak istedigini sorun. Ardindan, secilen sekle gore gerekli bilgileri alarak alani hesaplayin.
  (1-Dikdortgen, 2-Kare, 3-Ucgen)
   */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1- Dikdörtgen \n"+
                           "2- Kare \n"+
                           "3- Üçgen");
        System.out.print("Alanını hesaplamak istediğiniz şekili seçiniz: ");
        int shape=scanner.nextInt();

        boolean condition = true;


         switch (shape){
            case 1:
                System.out.print("Kısa kenarı giriniz: ");
                double a=scanner.nextDouble();
                System.out.print("Uzun kenarı giriniz: ");
                double b= scanner.nextDouble();
                System.out.println("Alan: "+ (a*b));
                break;
            case 2:
                System.out.print("Bir kenarını giriniz: ");
                double c= scanner.nextDouble();
                System.out.println("Alan: "+(c*c));
                break;
            case 3:
                System.out.print("Yüksekliği giriniz: ");
                double h=scanner.nextDouble();
                System.out.print("Tabanı giriniz: ");
                double t= scanner.nextDouble();
                System.out.println("Alan: "+(t*h)/2);
                break;
            default:
                System.out.println("Geçerli bir şekil giriniz.");

        }
    }
}

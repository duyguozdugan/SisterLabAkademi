package soru7;

import java.util.Scanner;

public class Main {
    /*
    Soru7:
Switch-case kullan

Kullaniciya bir hava durumu kodu girmesini isteyin. Girdigi koda gore hava durumunu ekrana yazdirin.
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("1-5 arası bir kod giriniz: ");
        int weather= scanner.nextInt();
        /*
        1-Güneşli
        2-Bulutlu
        3-Parçalı Bulutlu
        4-Yağışlı
        5-Karlı
         */

        switch (weather){
            case 1:
                System.out.println("Hava Güneşli");
                break;
            case 2:
                System.out.println("Hava Bulutlu");
                break;
            case 3:
                System.out.println("Hava Parçalı Bulutlu");
                break;
            case 4:
                System.out.println("Hava Yağışlı");
                break;
            case 5:
                System.out.println("Hava Karlı");
                break;
            default:
                System.out.println("Geçersiz kod.");
        }
    }
}

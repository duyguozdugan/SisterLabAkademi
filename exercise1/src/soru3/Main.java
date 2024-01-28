package soru3;

import java.util.Scanner;

public class Main {
    /*
    Soru3:
Switch-case kullanmadan gerekiyorsa if kullan

Not Hesaplama
Kullanicidan bir ogrencinin sinav notunu girmesini isteyen ve bu notun harf notunu hesaplayarak ekrana yazdiran bir Java programi yazin.
(Ornegin, 90-100 arasi AA, 80-89 arasi BA, 70-79 arasi BB, 60-69 arasi CB, 50-59 arasi CC, 0-50 arasi FF)
     */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Vize notunuzu giriniz: ");
        int vize= scanner.nextInt();
        System.out.print("Final notunuzu giriniz: ");
        int finall= scanner.nextInt();

        double ort= (vize*40)/100 + (finall*60)/100;

        if(ort>=90 && ort<=100) System.out.println("Harf notunuz: AA");
        else if(ort>=80 && ort<=89) System.out.println("Harf notunuz: BA");
        else if(ort>=70 && ort<=79) System.out.println("Harf notunuz: BB");
        else if(ort>=60 && ort<=69) System.out.println("Harf notunuz: CB");
        else if(ort>=50 && ort<=59) System.out.println("Harf notunuz: CC");
        else System.out.println("Harf notunuz: FF");


    }
}

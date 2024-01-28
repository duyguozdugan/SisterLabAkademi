package soru6;

import java.util.Scanner;

public class Main {
    /*
    Soru6:
    if kullan
    Girilen 3 sayiyi "kucukten buyuge" siralayan programi yaziniz.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[] array = new double[3];
        for(int i=0; i<=2;i++){
            System.out.print("Bir sayı giriniz: ");
            array[i]=scanner.nextDouble();
        }

        double smallest= array[0];

        for(int i=0;i<=2;i++){
            if(array[i]<smallest) smallest=array[i];
        }
        System.out.println("En küçük sayı: "+smallest);


    }
}

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

        if(array[0]>array[1]) {
            double temp=array[0];
            array[0]=array[1];
            array[1]=temp;
        }
        if(array[1]>array[2]){
            double temp=array[1];
            array[1]=array[2];
            array[2]=temp;
        }
        if(array[0]>array[1]) {
            double temp=array[0];
            array[0]=array[1];
            array[1]=temp;
        }
        
        for(int i=0;i<=2;i++){
            System.out.println(array[i]);
        }


    }
}

package soru2;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Main {
    /*
    Soru: Cift Sayilari Filtreleme
    Bir ArrayList icinde rastgele sayilari saklayin.
    Cift sayilari bir HashSet icine ekleyip,
    tek sayilari bir ArrayList icine ekleyen bir program yazin.
     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers =new ArrayList<>();
        Random random=new Random();
        HashSet<Integer> evenNumbers=new HashSet<>();
        ArrayList<Integer> oddNumbers=new ArrayList<>();
        int numberOfRandomNumbers=10;
        for(int i=0; i<numberOfRandomNumbers;i++){
            int randomNumbers= random.nextInt(100);
            numbers.add(randomNumbers);
        }

        for(int i=0; i<numbers.size();i++){
            if(numbers.get(i)%2==0){
            evenNumbers.add(numbers.get(i));
            }
            else{
                oddNumbers.add(numbers.get(i));
            }
        }

        System.out.println("Çift sayılar:");
        for(int even : evenNumbers){
            System.out.println(even);
        }

        System.out.println("Tek sayılar:");
        for(int odd: oddNumbers){
            System.out.println(odd);
        }


    }
}

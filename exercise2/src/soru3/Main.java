package soru3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    /*
    Soru: Oyuncu Puanlari
    Bir oyuncu puan sistemini simule eden bir program yazin.
    Oyuncularin isimlerini anahtar, puanlarini deger olarak kullanarak bir HashMap icinde saklayin.
    Oyunculara puan eklemek ve puanlarini goruntulemek gibi islemleri gerceklestiren bir program yazin.
    */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        HashMap<String, Integer> players= new HashMap<>();

        players.put("LeBron",1463);
        players.put("Kevin",1024);
        players.put("Stephen",922);

        while (true){
            System.out.print("Oyuncuları ve puanları görüntülemek için 1'e,\n"+
                    "Oyunculara puan eklemek için 2'ye, \n"+
                    "Çıkış yapmak için 3'e basınız. \n");
            System.out.print("Seçim: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    for(Map.Entry<String, Integer> entry : players.entrySet()){
                        System.out.println(entry.getKey()+ " "+ entry.getValue());
                    }
                    break;
                case 2:
                    System.out.print("Hangi oyuncuya puan eklemek istiyorsunuz: ");
                    String name= scanner.next();
                    if(players.containsKey(name)){
                        int point = players.get(name);
                        System.out.print(name+" isimli oyuncuya kaç puan eklemek istiyorsunuz: ");
                        int addPoint= scanner.nextInt();
                        point+=addPoint;
                        players.put(name,point);
                    }
                    else System.out.println("Oyuncu bulunamadı.");
                    System.out.println(name+" isimli oyuncuya başarıyla ekleme yapıldı.");
                    break;
                case 3:
                    System.out.println("Çıkış yapılıyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Hatalı bir seçim yaptınız.");

            }
        }

    }
}

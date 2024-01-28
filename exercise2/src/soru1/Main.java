package soru1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    /*
    Soru: Ogrenci Notlari
    Bir ogrenci not takip sistemi yazin.
    Her ogrencinin adini anahtar, notunu deger olarak iceren bir HashMap kullanarak,
    kullaniciya ogrenci eklemesini ve bir ogrencinin notunu sorgulamasini saglayan bir program yapin.
     */
    public static void main(String[] args) {
        HashMap<String, Integer> students= new HashMap<String, Integer>();
        Scanner scanner= new Scanner(System.in);

        while(true){
            System.out.println("Öğrenci eklemek için 1'e \n"+
                               "Sorgulamak için 2'ye \n"+
                               "Çıkış yapmak için 3'e basınız.");
            System.out.print("Seçim: ");
            int choice=scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Kaç öğrenci eklenecek: ");
                    int record= scanner.nextInt();
                    for(int i=0; i<record;i++){
                        System.out.print((i+1)+". öğrencinin ismi: ");
                        String name= scanner.next().toLowerCase();
                        System.out.print((i+1)+". öğrencinin notu: ");
                        int grade= scanner.nextInt();
                        students.put(name,grade);
                    }
                    break;
                case 2:
                    System.out.print("Sorgulanacak öğrencinin ismi: ");
                    String name= scanner.next().toLowerCase();
                    if(students.containsKey(name)){
                        int grade= students.get(name);
                        System.out.println(name+" isimli öğrencinin notu: "+grade);
                    }
                    else System.out.println("Öğrenci bulunamadı");
                    break;
                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Hatalı işlem yaptınız.");
            }
        }


    }
}
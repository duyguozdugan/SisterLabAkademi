package soru4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    /*
    Soru: Satis Takibi
    Bir sirketin satislarini takip eden bir program yazin.
    Her musterinin adini anahtar, satis miktarini deger olarak iceren bir HashMap kullanin.
    Toplam satis miktarini hesaplayarak en cok satis yapan musteriyi bulan bir program yazin.
     */

    public static void main(String[] args) {
        HashMap<String, Integer> customer=new HashMap<>();

        customer.put("Can Bakkal",13);
        customer.put("Vural Bakkal", 16);
        customer.put("Sandal Bakkal", 32);
        String mostSalesCustomer="";
        int maxSalesQuantity=0;


        for(Map.Entry<String, Integer> entry : customer.entrySet()){
               String customerName= entry.getKey();
               int salesQuantity= entry.getValue();
               if(salesQuantity>maxSalesQuantity){
                   maxSalesQuantity=salesQuantity;
                   mostSalesCustomer=customerName;
               }
        }

        if(!mostSalesCustomer.isEmpty()){
            System.out.println("En çok satış yapan müşteri: "+mostSalesCustomer);
            System.out.println("Satış miktarı: "+maxSalesQuantity);
        }




    }
}

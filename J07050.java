/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.io.*;
import java.util.*;

/**
 *
 * @author ADMIN
 */
public class J07050 {
    static class Product{
        public String id,name,type;
        public double saleprice,purchaseprice,profit;
        public static int number=0;
        
        public Product(String name, String type, double purchaseprice, double saleprice) {
            this.number+=1;
            this.id = "MH"+String.format("%02d", this.number);
            this.name = name;
            this.type = type;
            this.saleprice = saleprice;
            this.purchaseprice = purchaseprice;
            this.profit = this.saleprice-this.purchaseprice;
        }
        
        @Override
        public String toString(){
            return this.id+" "+this.name+" "+this.type+" "+String.format("%.2f", this.profit);
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = sc.nextInt();
        ArrayList<Product> arr = new ArrayList<>();
        while(t-->0){
            sc.nextLine();
            arr.add(new Product(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(arr,new Comparator<Product>(){
            @Override
            public int compare(Product o1,Product o2){
                if(o2.profit>o1.profit){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        for(Product x: arr){
            System.out.println(x);
        }
    }
}

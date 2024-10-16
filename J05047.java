/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J05047 {
    public static HashMap<String,Integer> map = new HashMap<>();
    static class Product implements Comparable<Product>{
        public String id,name,type;
        public double tax,price;
        public int quantity;
        public double unit_price;

        public Product(String name, int quantity, double unit_price) {
            String [] a = name.split("\\s+");
            this.type=a[a.length-1];
            a[a.length-1]="";
            String res="";
            String type="";
            for(String x:a){
                if(!x.equals("")){
                    res+=x;
                    type+=Character.toUpperCase(x.charAt(0));
                }
                res+=" ";
            }
            if(map.containsKey(type)){
                map.put(type, map.get(type)+1);
            }else map.put(type, 1);
            this.id=type+String.format("%02d", map.get(type));
            this.name = res.trim();
            this.quantity = quantity;
            this.unit_price = unit_price;
            if(quantity>10){
                this.tax=this.unit_price*this.quantity*0.05;
            }else if(quantity>=8){
                this.tax=this.unit_price*this.quantity*0.02;
            }else if(quantity>=5){
                this.tax=this.unit_price*this.quantity*0.01;
            }else{
                this.tax=this.unit_price*this.quantity*0;
            }
            this.price=this.unit_price*this.quantity-this.tax;
        }

        public String toString(){
            return this.id+" "+this.name+" "+this.type+" "+String.format("%.0f", this.tax)
                    +" "+String.format("%.0f", this.price);
        }

        @Override
        public int compareTo(Product o) {
            if(this.tax>=o.tax){
                return -1;
            }else{
                return 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product>arr = new ArrayList<>();
        int t = sc.nextInt();
        while(t-->0){
            sc.nextLine();
            arr.add(new Product(sc.nextLine(),sc.nextInt(),sc.nextDouble()));
        }
        Collections.sort(arr);
        for(Product x:arr){
            System.out.println(x);
        }
    }
}

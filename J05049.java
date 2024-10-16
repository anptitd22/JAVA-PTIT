/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J05049 {
    public static double Round(double x){
        if(x-(int)x>=0.5){
            return Math.ceil(x);
        }else{
            return Math.floor(x);
        }
    }
    static class Order implements Comparable<Order>{
        public String name;
        public int stock,unit_price;
        public double quantity,price,tax;

        public Order(String name, int stock) {
            this.name = name;
            this.stock = stock;
            if(name.charAt(0)=='A'){
                this.quantity=Round(stock*1.0*0.6);
                if(name.charAt(name.length()-1)=='Y'){
                    this.unit_price=110000;
                    this.price=110000*this.quantity;
                    this.tax=this.price*0.08;
                }else{
                    this.unit_price=135000;
                    this.price=135000*this.quantity;
                    this.tax=this.price*0.11;
                }
            }else{
                this.quantity=Round(stock*1.0*0.7);
                if(name.charAt(name.length()-1)=='Y'){
                    this.unit_price=110000;
                    this.price=110000*this.quantity;
                    this.tax=this.price*0.17;
                }else{
                    this.unit_price=135000;
                    this.price=135000*this.quantity;
                    this.tax=this.price*0.22;
                }
            }
        }
        public String toString(){
            return this.name+" "+this.stock+" "+String.format("%.0f", this.quantity)
                    +" "+this.unit_price
                    +" "+String.format("%.0f", this.price)+" "
                    +String.format("%.0f", this.tax);
        }  

        @Override
        public int compareTo(Order o) {
            if(this.tax<o.tax){
                return 1;
            }else{
                return -1;
            }
        }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Order> arr1 = new ArrayList<>();
        ArrayList<Order> arr2 = new ArrayList<>();
        int t=sc.nextInt();
        while(t-->0){
            String res=sc.next();
            if(res.charAt(0)=='A'){
                arr1.add(new Order(res, sc.nextInt()));
            }else{
                arr2.add(new Order(res, sc.nextInt()));
            }
        }
        Collections.sort(arr1);
        Collections.sort(arr2);
        char s=sc.next().charAt(0);
        if(s=='A'){
            for(Order x : arr1){
                System.out.println(x);
            }
        }else{
            for(Order x : arr2){
                System.out.println(x);
            }
        }
    }
}

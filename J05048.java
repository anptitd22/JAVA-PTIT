/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J05048 {
    public static double Round(double x){
        if(x-(int)x>=0.5){
            return Math.ceil(x);
        }else{
            return Math.floor(x);
        }
    }
    static class Order{
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
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            System.out.println(new Order(sc.next(), sc.nextInt()));
        }
    }
}

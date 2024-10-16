/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class J05036 {
    public static double Round(double x){
        if(x-(int)(x)>=0.5){
            return Math.ceil(x);
        }else{
            return Math.floor(x);
        }
    }
    static class Product{
        public String id,name,type;
        public double importPrice;
        public int quantity;
        public double sellingPrice,price,fee;
        public static int number = 0;

        public Product(String name, String type, double importPrice, int quantity) {
            this.number +=1;
            this.id= String.format("MH%02d", this.number);
            this.name = name;
            this.type = type;
            this.importPrice = importPrice;
            this.quantity = quantity;
            this.fee=(this.importPrice*this.quantity)*0.05;
            this.price=this.importPrice*this.quantity+this.fee;
            this.sellingPrice=this.price+this.price*0.02;
            this.fee=Round(this.fee);
            this.price=Round(this.price);
            this.sellingPrice=Round(this.sellingPrice);
        }
        
        public String toString(){
            return this.id+" "+this.name+" "+this.type+" "+String.format("%.0f", this.fee)
                    +" "+String.format("%.0f", this.price)+" "+String.format("%.0f", this.sellingPrice);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            sc.nextLine();
            System.out.println(new Product(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextInt()));
        }
    }
}

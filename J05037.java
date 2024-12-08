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
public class J05037 {
    static class Product implements Comparable<Product>{
        public String id,name,type;
        public double unit_price,quantinum,ship,price,buy;
        public static int number = 0;

        public Product(String name, String type, double unit_price, double quantinum) {
            number +=1;
            this.id= String.format("MH%02d", number);
            this.name = name;
            this.type = type;
            this.unit_price = unit_price;
            this.quantinum = quantinum;
            this.ship=unit_price*quantinum*0.05;
            this.price=unit_price*quantinum+this.ship;
            this.buy=(this.price+this.price*0.02)/quantinum;
            this.buy/=100;
            this.buy=Math.ceil(this.buy);
            this.buy*=100;
//            this.buy/=100;
//            if(this.buy-(int)(this.buy)>=0.5){
//                this.buy=Math.ceil(this.buy);
//            }else{
//                this.buy=Math.floor(this.buy);
//            }
//            this.buy*=100;
        }
        
        public String toString(){
            return this.id+" "+this.name+" "+this.type+" "+String.format("%.0f", this.ship)+" "+String.format("%.0f", this.price)+" "+String.format("%.0f", this.buy);
        }

        @Override
        public int compareTo(Product o) {
            if(this.buy>=o.buy){
                return -1;
            }else{
                return 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> arr = new ArrayList<>();
        int t = sc.nextInt();
        while(t-->0){
            sc.nextLine();
            arr.add(new Product(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(arr);
        for(Product x : arr){
            System.out.println(x);
        }
    }
}

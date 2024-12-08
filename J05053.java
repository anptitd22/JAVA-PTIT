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
public class J05053 {
    static class Order implements Comparable<Order>{
        public String name,id,number,type;
        public long unit_price,quantinum,sale,price,total;

        public Order(String name, String id, long unit_price, long quantinum) {
            this.name = name;
            this.id = id;
            this.unit_price = unit_price;
            this.quantinum = quantinum;
            this.price=this.unit_price*this.quantinum;
            this.number=id.substring(1,4);
            this.type = id.substring(4,5);
            if(this.type.equals("1")){
                this.sale=(this.unit_price/100*50)*this.quantinum;
            }else{
                this.sale=(this.unit_price/100*30)*this.quantinum;
            }
            this.total=this.price-this.sale;
        }
        public String toString(){
            return this.name+" "+this.id+" "+this.number+" "+this.sale+" "+this.total;
        }

        @Override
        public int compareTo(Order o) {
            return this.number.compareTo(o.number);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Order> arr = new ArrayList<>();
        int t =sc.nextInt();
        while(t-->0){
            sc.nextLine();
            arr.add(new Order(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
            
        }
        Collections.sort(arr);
        for(Order x:arr){
            System.out.println(x);
        }
    }
}

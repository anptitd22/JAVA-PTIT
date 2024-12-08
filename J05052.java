/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J05052 {
    static class Product{
        public String name,type,id,number;
        public long unit_price,quantinum,total_price,sale;

        public Product(String name, String id, long unit_price, long quantinum) {
            this.name = name;
            this.id = id;
            this.unit_price = unit_price;
            this.quantinum = quantinum;
            this.number=id.substring(1, 4);
            this.type=id.substring(4,5);
            this.total_price=this.unit_price*this.quantinum;
            if(this.type.equals("1")){
                this.sale=this.total_price/100 *50;
            }else{
                this.sale=this.total_price/100 *30;
            }
            this.total_price-=this.sale;
        }
        public String toString(){
            return this.name+" "+this.id+" "+this.number+" "+this.sale+" "+this.total_price;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            sc.nextLine();
            System.out.println(new Product(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
    }
}

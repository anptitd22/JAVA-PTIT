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
class Bill{
    public String id;
    public double unit_price,quantity,vat,transpot;

    public Bill(String id, double unit_price, double quantity) {
        this.id = id;
        this.quantity = quantity;
        double res=1.0;
        if(id.charAt(3)=='C'){
            res=0.95;
        }
        if(id.charAt(0)=='T'){
            this.vat+=0.29;
            this.transpot=0.04;
        }else if(id.charAt(0)=='C'){
            this.vat+=0.1;
            this.transpot=0.03;
        }else if(id.charAt(0)=='D'){
            this.vat+=0.08;
            this.transpot=0.025;
        }else{
            this.vat+=0.02;
            this.transpot=0.005;
        }
        this.unit_price=unit_price+unit_price*this.vat*res+unit_price*this.transpot;
        this.unit_price+=this.unit_price*0.2;
    }
    
    public String toString(){
        return this.id+' '+String.format("%.2f", this.unit_price);
    }
}
public class J05073 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String [] a= sc.nextLine().split("\\s+");
            Bill s= new Bill(a[0],Double.parseDouble(a[1]),Double.parseDouble(a[2]));
            System.out.println(s);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07056 {
    public static int [] a = {100,500,200};
    static class Customer{
        public String id,name;
        public double nb,price1,price2,price,vat;
        public static int number =0;

        public Customer(String name, String type, double p1, double p2) {
            this.number+=1;
            this.id="KH"+String.format("%02d", this.number);
            String []b = name.split("\\s+");
            String res="";
            for(String x:b){
                res+=Character.toUpperCase(x.charAt(0));
                for(int j=1;j<x.length();j++){
                    res+=Character.toLowerCase(x.charAt(j));
                }
                res+=" ";
            }
            this.name = res.trim();
            this.nb=p2-p1;
            this.price1=Math.min(this.nb, a[type.charAt(0)-'A'])*450;
            this.price2=Math.max(this.nb-a[type.charAt(0)-'A'],0)*1000;
            this.vat=this.price2*0.05;
            this.price = this.price1+this.price2+this.vat;
        }
        public String toString(){
            return this.id+" "+this.name+" "+String.format("%.0f", this.price1)
                    +" "+String.format("%.0f", this.price2)+" "
                    +String.format("%.0f", this.vat)+" "+String.format("%.0f", this.price);
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<Customer> arr = new ArrayList<>();
        int t=sc.nextInt();
        while(t-->0){
            sc.nextLine();
            arr.add(new Customer(sc.nextLine().trim(), sc.next(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr,new Comparator<Customer>(){
            @Override
            public int compare(Customer o1,Customer o2){
                if(o1.price<o2.price){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        for(Customer x:arr){
            System.out.println(x);
        }
    }
}

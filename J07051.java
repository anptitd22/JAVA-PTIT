/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07051 {
    public static int [] a = {25,34,50,80};
    static long getTime(String s1, String s2) throws ParseException{
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return f.parse(s2).getTime() - f.parse(s1).getTime();
        }
    static class Customer{
        public String id,name;
        public int room;
        public String checkin,checkout;
        public int price;
        public static int number=0;
        public long total_price,day;
        
        public Customer(String name, String room, String checkin, String checkout, int price) {
            this.number+=1;
            this.id="KH"+String.format("%02d", this.number);
            String [] b = name.split("\\s+");
            String res="";
            for(String x:b){
                res+=Character.toUpperCase(x.charAt(0));
                for(int j=1;j<x.length();j++){
                    res+=Character.toLowerCase(x.charAt(j));
                }
                res+=" ";
            }
            this.name = res.trim();
            this.room = Integer.parseInt(room);
            this.checkin = checkin;
            this.checkout = checkout;
            this.price = price;
            int unit=this.room/100;
            try{
                this.day=(getTime(this.checkin, this.checkout)/(1000*60*60*24)%365)+1;
                this.total_price=a[unit-1]*this.day+this.price;
            }catch(ParseException e){
                
            }
        }
        
        @Override
        public String toString(){
            return this.id+" "+this.name+" "+this.room+" "+this.day+" "+this.total_price;
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = sc.nextInt();
        ArrayList<Customer> arr = new ArrayList<>();
        while(t-->0){
            sc.nextLine();
            arr.add(new Customer(sc.nextLine().trim(), sc.next(),sc.next(), sc.next(), sc.nextInt()));
        }
        Collections.sort(arr,new Comparator<Customer>(){
           @Override
           public int compare(Customer o1,Customer o2){
               return (int)(o2.total_price-o1.total_price);
           }
        });
        for(Customer x:arr){
            System.out.println(x);
        }
    }
}

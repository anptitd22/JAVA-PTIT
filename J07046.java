/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
public class J07046 {
    static long getTime(String s1, String s2) throws ParseException{
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return f.parse(s2).getTime() - f.parse(s1).getTime();
    }
    static class Customer{
        public String id,name,room;
        public static int number = 0;
        public long day;

        public Customer(String name, String room, String checkin, String checkout) {
            this.number +=1;
            this.id = "KH" + String.format("%02d", this.number);
            this.name = name;
            this.room = room;
            try{
                this.day=getTime(checkin, checkout)/(1000*60*60*24)%365;
            }catch(ParseException e){
                
            }
        }
        @Override
        public String toString(){
            return this.id+" "+this.name+" "+this.room+" "+this.day;
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        ArrayList<Customer>a = new ArrayList<>();
        while(sc.hasNext()){
            int t=sc.nextInt();
            sc.nextLine();
            while(t-->0){
                a.add(new Customer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
            }
        }
        Collections.sort(a, new Comparator<Customer>(){
            @Override
            public int compare(Customer o1,Customer o2){
                return (int)(o2.day-o1.day);
            }
        });
        for(Customer x:a){
            System.out.println(x);
        }
        sc.close();
    }
}

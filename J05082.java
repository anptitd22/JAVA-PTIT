/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J05082 {
    static class Customer implements Comparable<Customer>{
        public String id,name,gender,birth,address;
        public long time;
        public static int number = 0;

        public Customer(String name, String gender, String birth, String address) throws ParseException{
            number +=1;
            this.id=String.format("KH%03d", number);
            String [] a = name.split("\\s+");
            String res="";
            for(String x:a){
                res+=Character.toUpperCase(x.charAt(0));
                for(int j =1;j<x.length();j++){
                    res+=Character.toLowerCase(x.charAt(j));
                }
                res+=" ";
            }
            this.name = res.trim();
            this.gender = gender;
            StringBuilder sb = new StringBuilder(birth);
            if(sb.charAt(1)=='/'){
                sb.insert(0, "0");
            }
            if(sb.charAt(4)=='/'){
                sb.insert(3, "0");
            }
            this.birth = sb.toString();
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            this.time = f.parse(this.birth).getTime()/1000;
            this.address = address;
        }
        public String toString(){
            return this.id+" "+this.name+" "+this.gender+" "+this.address+" "+this.birth;
        }

        @Override
        public int compareTo(Customer o) {
            return (int)(this.time-o.time);
        }
        
    }
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            arr.add(new Customer(sc.nextLine().trim(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(Customer x:arr){
            System.out.println(x);
        }
    }
}

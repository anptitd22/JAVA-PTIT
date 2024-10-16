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
public class J05051 {
    public static long Round(double x){
        if(x-(long)x>=0.5){
            return (long)Math.ceil(x);
        }else{
            return (long)Math.floor(x);
        }
    }
    static class Bill implements Comparable<Bill>{
        public String id,name;
        public int number,newn,oldn;
        public long price,tip,total;
        public static int n = 0;

        public Bill(String name, int newn, int oldn) {
            this.n+=1;
            this.id=String.format("KH%02d", this.n);
            this.name = name;
            this.newn = newn;
            this.oldn = oldn;
            if(name.equals("KD")){
                this.number=3;
            }else if(name.equals("NN")){
                this.number=5;
            }else if(name.equals("TT")){
                this.number=4;
            }else{
                this.number=2;
            }
            this.price=(oldn-newn)*this.number*550;
            if(oldn-newn>100){
                this.tip=this.price;
            }else if(oldn-newn>=50){
                this.tip=Round(this.price/100.0*35);
            }else{
                this.tip=0;
            }
            this.total=this.tip+this.price;
        }
        public String toString(){
            return this.id+" "+this.number+" "+this.price
                +" "+this.tip+" "+this.total;
        }

        @Override
        public int compareTo(Bill o) {
            return (int)(o.total-this.total);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Bill>arr = new ArrayList<>();
        while(t-->0){
            arr.add(new Bill(sc.next(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr);
        for(Bill x:arr){
            System.out.println(x);
        }
    }
}

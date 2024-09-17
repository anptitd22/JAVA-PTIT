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
class Petro{
    public String code,name;
    public long unit_price,tax,price;
    public int quantity;

    public Petro(String res) {
        String [] arr = res.split("\\s+");
        this.code = arr[0];
        this.quantity = Integer.parseInt(arr[1]);
        if(code.charAt(0)=='X'){
            this.unit_price=128000;
            this.price=this.quantity*this.unit_price;
            this.tax=this.price*3/100;
        }else if(code.charAt(0)=='D'){
            this.unit_price=11200;
            this.price=this.quantity*this.unit_price;
            this.tax=this.price*35/1000;
        }else{
            this.unit_price=9700;
            this.price=this.quantity*this.unit_price;
            this.tax=this.price*2/100;
        }
        
        String tmp=code.substring(code.length()-2,code.length());
        if(tmp.equals("BP")){
            this.name="British Petro";
        }else if(tmp.equals("ES")){
            this.name="Esso";
        }else if(tmp.equals("SH")){
            this.name="Shell";
        }else if(tmp.equals("MO")){
            this.name="Mobil";
        }else if(tmp.equals("CA")){
            this.name="Castrol";
        }else{
            this.name="Trong Nuoc";
            this.tax=0;
        }
    }
    @Override
    public String toString(){
        return this.code+" "+this.name+" "+this.unit_price+" "+this.tax+" "+(this.price+this.tax);
    }
}
public class J05067 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Petro> arr = new LinkedList<>();
        sc.nextLine();
        while(n-->0){
            Petro a = new Petro(sc.nextLine());
            arr.add(a);
        }
        for(Petro x:arr){
            System.out.println(x);
        }
    }
}

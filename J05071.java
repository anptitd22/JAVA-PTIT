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
public class J05071 {
    static class type{
        public int n,unit_price;
        public String name;

        public type(int n, int unit_price, String name) {
            this.n = n;
            this.unit_price = unit_price;
            this.name = name;
        }
        
    }
    public static HashMap<Integer,type> map = new HashMap<>();
    static class Number{
        public String number,stime,etime,nname;
        public int price,time;

        public Number(String number, String stime, String etime) {
            this.number = number;
            this.stime = stime;
            this.etime = etime;
            String [] arr1 = etime.split(":");
            String [] arr2 = stime.split(":");
            this.time=(Integer.parseInt(arr1[0])-Integer.parseInt(arr2[0]))*60+Integer.parseInt(arr1[1])-Integer.parseInt(arr2[1]);
            int res= Integer.parseInt(number.substring(0,3));
            if(map.containsKey(res)){
                this.price=this.time*map.get(res).unit_price;
                this.nname=map.get(res).name;
            }else{
                this.time=(int)Math.ceil(this.time*1.0/3);
                this.price=this.time*800;
                this.nname="Noi mang";
            }
        }
        
        public String toString(){
            return this.number+' '+this.nname+' '+this.time+' '+this.price;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            int unit_price=sc.nextInt();
            type s=new type(n, unit_price, name);
            map.put(n, s);
        }
        t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String [] a= sc.nextLine().split("\\s+");
            Number s=new Number(a[0],a[1],a[2]);
            System.out.println(s);
        }
    }
}

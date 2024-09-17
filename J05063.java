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
class DaThuc{
    public String polynomial;
    public int maxx;
    public int []arr;
    
    public DaThuc(){
        this.maxx=0;
        this.arr=new int [10001];
    }
    public DaThuc(String polynomial) {
        this.maxx=0;
        this.polynomial = polynomial;
        String [] a= polynomial.split("[+]");
        arr=new int [10001];
        for(String x:a){
            int s=0,s2=0;
            x=x.trim();
            int i=0;
            while(Character.isDigit(x.charAt(i))){
                s=s*10+(x.charAt(i)-'0');
                i+=1;
            }
            i+=3;
            while(i<x.length()){
                s2=s2*10+(x.charAt(i)-'0');
                i+=1;
            }
            this.maxx=Math.max(this.maxx,s2);
            arr[s2]=s;
        }
    }
    
    public DaThuc cong(DaThuc b){
        DaThuc c = new DaThuc();
        c.maxx=Math.max(this.maxx, b.maxx);
        String res="";
        for(int i=c.maxx;i>=0;i--){
            c.arr[i]=this.arr[i]+b.arr[i];
            if(c.arr[i]!=0){
                res+=Integer.toString(c.arr[i])+"*x^"+Integer.toString(i);
                res+=" + ";
            }
        }
        c.polynomial=res.substring(0,res.length()-3);
        return c;
    }
    @Override
    public String toString(){
        return this.polynomial;
    }
}
public class J05063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}

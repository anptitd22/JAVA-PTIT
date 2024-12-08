/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J05038 {
    static class NhanVien{
        public String id,name;
        public long price,day,total_price,tip,tip_price,total;
        public String chuc;
        public static int number = 0;
        public static long price_total = 0;

        public NhanVien() {
        }
        
        
        public NhanVien(String name, long price, long day, String chuc) {
            number +=1;
            this.id=String.format("NV%02d", number);
            this.name = name;
            this.price = price;
            this.day = day;
            this.total_price=day*price;
            if(this.day>=25){
                this.tip_price=this.total_price/100*20;
            }else if(this.day>=22){
                this.tip_price=this.total_price/100*10;
            }
            this.chuc = chuc;
            if(this.chuc.equals("GD")){
                this.tip=250000;
            }else if(this.chuc.equals("PGD")){
                this.tip=200000;
            }else if(this.chuc.equals("TP")){
                this.tip=180000;
            }else{
                this.tip=150000;
            }
            this.total=this.total_price+this.tip_price+this.tip;
            this.price_total += this.total;
        }
        public String toString(){
            return this.id+" "+this.name+" "+this.total_price+" "+this.tip_price+" "+this.tip+" "+this.total;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name = sc.nextLine();
            long price = sc.nextLong();
            long day = sc.nextLong();
            sc.nextLine();
            String chuc = sc.nextLine();
            System.out.println(new NhanVien(name, price, day, chuc));
        }
        System.out.printf("Tong chi phi tien luong: "+NhanVien.price_total);
    }
}

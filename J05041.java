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
public class J05041 {
    static class NhanVien implements Comparable<NhanVien>{
        public String ma,ten;
        public long luongcb,ngay,luong,thuong,pc,tong;
        public String chuc;
        public static int sl = 0;

        public NhanVien(String ten, long luongcb, long ngay, String chuc) {
            sl+=1;
            this.ma = String.format("NV%02d", sl);
            this.ten = ten;
            this.luongcb = luongcb;
            this.ngay = ngay;
            this.luong=luongcb*ngay;
            this.chuc = chuc;
            if(this.ngay>=25){
                this.thuong=this.luong/100*20;
            }else if (this.ngay>=22){
                this.thuong=this.luong/100*10;
            }
            if(chuc.equals("GD")){
                this.pc=250000;
            }else if(chuc.equals("PGD")){
                this.pc=200000;
            }else if(chuc.equals("TP")){
                this.pc = 180000;
            }else{
                this.pc = 150000;
            }
            this.tong=this.luong+this.thuong+this.pc;
        }
        public String toString(){
            return this.ma+" "+this.ten+" "+this.luong+" "+this.thuong+" "+this.pc+" "+this.tong;
        }

        @Override
        public int compareTo(NhanVien o) {
            if(this.tong>=o.tong){
                return -1;
            }else{
                return 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String ten = sc.nextLine();
            long luong = sc.nextLong();
            long ngay = sc.nextLong();
            sc.nextLine();
            String chuc = sc.nextLine();
            arr.add(new NhanVien(ten, luong, ngay, chuc));
        }
        Collections.sort(arr);
        for(NhanVien x:arr){
            System.out.println(x);
        }
    }
}

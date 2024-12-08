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
public class J05045 {
    static class NhanVien implements Comparable<NhanVien>{
        public String id,name,chuc;
        public long unit_salary,day,tip,salary,total,sa;
        public double ung;
        public static int number = 0;

        public NhanVien(String name, String chuc, long unit_salary, long day) {
            number +=1;
            this.id=String.format("NV%02d", number);
            this.name = name;
            this.chuc = chuc;
            this.unit_salary = unit_salary;
            this.day = day;
            this.salary=this.unit_salary*this.day;
            if(chuc.equals("GD")){
                this.tip = 500;
            }else if (chuc.equals("PGD")){
                this.tip=400;
            }else if(chuc.equals("TP")){
                this.tip=300;
            }else if(chuc.equals("KT")){
                this.tip = 250;
            }else{
                this.tip = 100;
            }
            this.ung=(double)((this.tip*1.0+this.salary*1.0)*(2.0/3.0));
            if(this.ung <25000){
                this.ung/=1000;
                this.ung=Math.round(this.ung);
                
                this.ung*=1000;
                
            }else{
                this.ung=25000;
            }
            this.total=this.salary-(long)this.ung+this.tip;
            this.sa=this.salary+this.tip;
        }
        public String toString(){
            return this.id+" "+this.name+" "+this.tip+" "+this.salary+" "+String.format("%.0f", this.ung)+" "+this.total;
        }

        @Override
        public int compareTo(NhanVien o) {
            if(this.sa==o.sa){
                return this.id.compareTo(o.id);
            }else{
                if(this.sa>o.sa){
                    return -1;
                }else{
                    return 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<NhanVien> arr = new ArrayList<>();
        while(t-->0){
            sc.nextLine();
            arr.add(new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        Collections.sort(arr);
        for(NhanVien x:arr){
            System.out.println(x);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J05044 {
    static class NhanVien{
        public String id,name,chuc;
        public long unit_salary,day,tip,salary,total;
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
                if(this.ung-(int)this.ung>=0.5){
                    this.ung = Math.ceil(this.ung);
                }else{
                    this.ung=Math.floor(this.ung);
                }
                
                this.ung*=1000;
                
            }else{
                this.ung=25000;
            }
            this.total=this.salary-(long)this.ung+this.tip;
        }
        public String toString(){
            return this.id+" "+this.name+" "+this.tip+" "+this.salary+" "+String.format("%.0f", this.ung)+" "+this.total;
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
        sc.nextLine();
        String s = sc.nextLine();
        for(NhanVien x:arr){
            if(x.chuc.equals(s)){
                System.out.println(x);
            }
        }
    }
}

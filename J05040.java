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
public class J05040 {
    static class NhanVien{
        public String id,name;
        public long unit_salary,day,salary,tip,help,total;
        public String chuc;
        public static int number = 0;

        public NhanVien(String name, long unit_salary, long day, String chuc) {
            number +=1;
            this.id=String.format("NV%02d", number);
            this.name = name;
            this.unit_salary = unit_salary;
            this.day = day;
            this.chuc = chuc;
            this.salary=this.unit_salary*this.day;
            if(day>=25){
                this.help=this.salary/100*20;
            }else if(day>=22){
                this.help=this.salary/100*10;
            }
            if(chuc.equals("GD")){
                this.tip=250000;
            }else if(chuc.equals("PGD")){
                this.tip=200000;
            }else if(chuc.equals("TP")){
                this.tip=180000;
            }else{
                this.tip=150000;
            }
            this.total=this.salary+this.help+this.tip;
        }
        public String toString(){
            return this.id+" "+this.name+" "+this.salary+" "+this.help+" "+this.tip+" "+this.total;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        ArrayList<NhanVien> arr = new ArrayList<>();
        sc.nextLine();
        while(t-->0){
            String name = sc.nextLine();
            long luong = sc.nextLong();
            long day = sc.nextLong();
            sc.nextLine();
            String chuc = sc.nextLine();
            System.out.println(new NhanVien(name, luong, day, chuc));
        }
    }
}

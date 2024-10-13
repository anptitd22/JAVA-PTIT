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
public class J05024 {
    public static String nganh(String x){
        if(x.equals("KE TOAN")) return "DCKT";
        else if(x.equals("CONG NGHE THONG TIN")) return "DCCN";
        else if(x.equals("AN TOAN THONG TIN")) return "DCAT";
        else if(x.equals("VIEN THONG")) return "DCVT";
        else return "DCDT";
    }
    static class Student{
        public String id,name,className,email;

        public Student(String id, String name, String className, String email) {
            this.id = id;
            this.name = name;
            this.className = className;
            this.email = email;
        }

        @Override
        public String toString(){
            return this.id+" "+this.name+" "+this.className+" "+this.email;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            arr.add(new Student(sc.nextLine(), sc.nextLine(), 
                    sc.nextLine(), sc.nextLine()));
        }
        int k = sc.nextInt();
        sc.nextLine();
        while(k-->0){
            String s = sc.nextLine().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH "+s+":");
            for(Student x : arr){
                if(x.id.substring(3,7).equals(nganh(s))
                        && !(x.className.charAt(0)=='E'&&(nganh(s)=="DCCN"||nganh(s)=="DCAT"))){
                    System.out.println(x);
                }
            }
        }
    }
}


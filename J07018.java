/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07018 {
    static class Student{
        public String id,name,name_Class,birth;
        public float gpa;
        public static int number =0;

        public Student(String name, String name_Class, String birth, float gpa) {
            number +=1;
            this.id = String.format("B20DCCN%03d", number);
            String [] a = name.split("\\s+");
            String res ="";
            for(String x:a){
                res+=Character.toUpperCase(x.charAt(0));
                for(int j =1;j<x.length();j++){
                    res+=Character.toLowerCase(x.charAt(j));
                }
                res+=" ";
            }
            this.name = res.trim();
            this.name_Class = name_Class;
            StringBuilder sb = new StringBuilder(birth);
            if(sb.charAt(1)=='/'){
                sb.insert(0, "0");
            }
            if(sb.charAt(4)=='/'){
                sb.insert(3,"0");
            }
            this.birth = sb.toString();
            this.gpa = gpa;
        }
        public String toString(){
            return this.id+" "+this.name+" "+this.name_Class+" "+this.birth+" "+String.format("%.2f", this.gpa);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = sc.nextInt();
        while(t-->0){
            sc.nextLine();
            System.out.println(new Student(sc.nextLine().trim(), sc.nextLine(), sc.nextLine(), sc.nextFloat()));
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07057 {
    public static double [] ab = {1.5,1,0};
    static class Student{
        public String code,name,adr,status;
        public double score;
        public int plus;
        public static int number = 0;

        public Student(String name, double score, String adr, int plus) {
            this.number +=1;
            this.code = String.format("TS%02d", this.number);
            String [] a = name.split("\\s+");
            String res="";
            for(String x:a){
                res+=Character.toUpperCase(x.charAt(0));
                for(int i=1;i<x.length();i++){
                    res+=Character.toLowerCase(x.charAt(i));
                }
                res+=" ";
            }
            this.name=res.trim();
            this.score = score;
            this.plus = plus;
            this.adr = adr;
            if(!this.adr.equals("Kinh")){
                this.score += 1.5;
            }
            this.score += ab[this.plus-1];
            if(this.score>=20.5){
                this.status="Do";
            }else{
                this.status="Truot";
            }
        }
        @Override
        public String toString(){
            return this.code+" "+this.name+" "+String.format("%.1f", this.score)+" "+this.status;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<Student> arr = new ArrayList();
        int t = sc.nextInt();
        while(t-->0){
            sc.nextLine();
            String name = sc.nextLine();
            Double score = sc.nextDouble();
            sc.nextLine();
            String adr = sc.nextLine();
            int plus = sc.nextInt();
            arr.add(new Student(name.trim(), score, adr, plus));
        }
        Collections.sort(arr,new Comparator<Student>(){
           @Override
           public int compare(Student o1,Student o2){
               if(o1.score!=o2.score){
                   if(o1.score>=o2.score){
                       return -1;
                   }else{
                       return 1;
                   }
               }else{
                   return o1.code.compareTo(o2.code);
               }
           }
        });
        for(Student x:arr){
            System.out.println(x);
        }
    }
}

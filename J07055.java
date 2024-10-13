/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07055 {
    static class Student implements Comparable<Student>{
        public String id,name;
        public double d1,d2,d3;
        public String status;
        public double score;
        public static int number = 0;

        public Student(String name, double d1, double d2, double d3) {
            this.number+=1;
            this.id="SV"+String.format("%02d", this.number);
            String []b = name.split("\\s+");
            String res="";
            for(String x:b){
                res+=Character.toUpperCase(x.charAt(0));
                for(int j=1;j<x.length();j++){
                    res+=Character.toLowerCase(x.charAt(j));
                }
                res+=" ";
            }
            this.name = res.trim();
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
            this.score=d1*0.25+d2*0.35+d3*0.4;
            if(this.score>=8){
                this.status="GIOI";
            }else if(this.score>=6.5){
                this.status="KHA";
            }else if(this.score>=5){
                this.status="TRUNG BINH";
            }else{
                this.status="KEM";
            }
        }
        
        @Override
        public int compareTo(Student o1){
            if(this.score<o1.score){
                return 1;
            }else{
                return -1;
            }
        }
        
        @Override
        public String toString(){
            return this.id+" "+this.name+" "+String.format("%.2f", this.score)+" "+this.status;
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<Student> arr = new ArrayList<>();
        int t=sc.nextInt();
        while(t-->0){
            sc.nextLine();
            arr.add(new Student(sc.nextLine().trim(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(arr);
        for(Student x: arr){
            System.out.println(x);
        }
    }
}
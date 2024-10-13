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
public class J07052 {
    public static double []a = {0.5,1.0,2.5};
    static class Student{
        public String id,name;
        public double d1,d2,d3;
        public double type,score;
        public String status;

        public Student(String id, String name, double d1, double d2, double d3) {
            this.id = id;
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
            this.type=a[(id.charAt(2)-'0')-1];
            this.score=this.type+this.d1*2+this.d2+this.d3;
        }
        
        public String toString(){
            if(this.type==(int)(this.type)&&this.score!=(int)(this.score)){
                int type=(int)(this.type);
                return this.id+" "+this.name+" "+type+" "+String.format("%.1f", this.score)+" "+this.status;
            }else if(this.type!=(int)(this.type)&&this.score==(int)(this.score)){
                int score = (int)(this.score);
                return this.id+" "+this.name+" "+String.format("%.1f", this.type)+" "+score+" "+this.status;
            }else if(this.type==(int)(this.type)&&this.score==(int)(this.score)){
                int type=(int)(this.type);
                int score=(int)(this.score);
                return this.id+" "+this.name+" "+type+" "+score+" "+this.status;
            }else{
                return this.id+" "+this.name+" "+String.format("%.1f", this.type)+" "+String.format("%.1f", this.score)+" "+this.status;
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t=sc.nextInt();
        ArrayList<Student> arr = new ArrayList<>();
        while(t-->0){
            sc.nextLine();
            arr.add(new Student(sc.nextLine(), sc.nextLine().trim(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        int k = sc.nextInt();
        Collections.sort(arr,new Comparator<Student>(){
            @Override
            public int compare(Student o1,Student o2){
                if(o1.score!=o2.score){
                    if(o1.score<o2.score){
                        return 1;
                    }else{
                        return -1;
                    }
                }else{
                    return o1.id.compareTo(o2.id);
                }
            }
        });
        double ans=arr.get(k-1).score;
        System.out.printf("%.1f",ans);
        System.out.println();
        for(Student x:arr){
            if(x.score>=ans){
                x.status="TRUNG TUYEN";
            }else{
                x.status="TRUOT";
            }
            System.out.println(x);
        }
    }
}

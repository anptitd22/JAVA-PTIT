/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.*;
import java.io.*;

/**
 *
 * @author ADMIN
 */
public class J05018 {
    static class Student{
        public String id,name,status;
        public double d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
        public double score;
        public static int number = 0 ;

        public Student(String name, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
            this.number+=1;
            this.id=String.format("HS%02d", this.number);
            this.name = name;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
            this.d4 = d4;
            this.d5 = d5;
            this.d6 = d6;
            this.d7 = d7;
            this.d8 = d8;
            this.d9 = d9;
            this.d10 = d10;
            this.score = (d1*2+d2*2+d3+d4+d5+d6+d7+d8+d9+d10)/12;
            if(this.score>=9){
                this.status="XUAT SAC";
            }else if(this.score>=8){
                this.status="GIOI";
            }else if(this.score>=7){
                this.status="KHA";
            }else if(this.score>=5){
                this.status="TB";
            }else{
                this.status="YEU";
            }
            this.score*=10;
            if(this.score-(int)(this.score)>=0.5){
                this.score=Math.ceil(this.score);
            }else{
                this.score=Math.floor(this.score);
            }
            this.score/=10;
        }
        public String toString(){
            return this.id+" "+this.name+" "+String.format("%.1f", this.score)+" "+this.status;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        int t = sc.nextInt();
        while(t-->0){
            sc.nextLine();
            arr.add(new Student(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), 
                    sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), 
                    sc.nextDouble(), sc.nextDouble(), sc.nextDouble(),
                    sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(arr,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
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
        for(Student x: arr){
            System.out.println(x);
        }
    }
}

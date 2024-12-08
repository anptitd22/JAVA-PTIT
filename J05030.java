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
public class J05030 {
    static class Student implements Comparable<Student>{
        public String code,name,name_class;
        public float d1,d2,d3;

        public Student(String code, String name, String name_class, float d1, float d2, float d3) {
            this.code = code;
            this.name = name;
            this.name_class = name_class;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }
        
        public String toString(){
            return this.code+" "+this.name+" "+this.name_class+" "+String.format("%.1f", this.d1)
                    +" "+String.format("%.1f", this.d2)+" "+String.format("%.1f", this.d3);
        }

        @Override
        public int compareTo(Student o) {
            return this.code.compareTo(o.code);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        int t = sc.nextInt();
        while(t-->0){
            sc.nextLine();
            arr.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
        }
        int cnt=1;
        Collections.sort(arr);
        for(Student x: arr){
            System.out.println(cnt+" "+x);
            cnt++;
        }
    }
}

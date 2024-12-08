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
public class J05054_F {
    static class Student implements Comparable<Student>{
        public String id,name;
        public float gpa;
        public String status;
        public int rank;
        public static int number =0;

        public Student(String name, float gpa) {
            number+=1;
            this.id=String.format("HS%02d", number);
            this.name = name;
            this.gpa = gpa;
            if(this.gpa>=9){
                this.status="Gioi";
            }else if(this.gpa>=7){
                this.status="Kha";
            }else if(this.gpa>=5){
                this.status="Trung Binh";
            }else{
                this.status="Yeu";
            }
        }
        public String toString(){
            return this.id+" "+this.name+" "+String.format("%.1f", this.gpa)+" "+this.status+" "+this.rank;
        }

        @Override
        public int compareTo(Student o) {
            if(this.gpa<=o.gpa){
                return -1;
            }else{
                return 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        ArrayList<Student> arr1 = new ArrayList<>();
        int t = sc.nextInt();
        while(t-->0){
            sc.nextLine();
            Student x=new Student(sc.nextLine(), sc.nextFloat());
            arr.add(x);
            arr1.add(x);
        }
        Collections.sort(arr);
        for(Student x:arr1){
            for(int i=0;i<arr.size();i++){
                if(arr.get(i).gpa==x.gpa){
                    x.rank=i+1;
                    break;
                }
            }
            System.out.println(x);
        }
    }
}

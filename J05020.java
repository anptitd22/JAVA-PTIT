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
public class J05020 {
    static class Student implements Comparable<Student>{
        public String id,name,className,email;

        public Student(String id, String name, String className, String email) {
            this.id = id;
            this.name = name;
            this.className = className;
            this.email = email;
        }

        @Override
        public int compareTo(Student o) {
            if(this.className.compareTo(o.className)==0){
                return this.id.compareTo(o.id);
            }else{
                return this.className.compareTo(o.className);
            }
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
        Collections.sort(arr);
        for(Student x : arr){
            System.out.println(x);
        }
    }
}

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
public class J05035 {
    static class Student implements Comparable<Student>{
        public int id;
        public String code,name,name_class,email,dn;
        public static int number = 0;
        
        public Student(String code, String name, String name_class, String email, String dn) {
            number +=1;
            this.id=number;
            this.code = code;
            this.name = name;
            this.name_class = name_class;
            this.email = email;
            this.dn = dn;
        }

        @Override
        public int compareTo(Student o) {
            return this.code.compareTo(o.code);
        }
        public String toString(){
            return this.id+" "+this.code+" "+this.name+" "+this.name_class+" "+this.email+" "+this.dn;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            arr.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        int k =sc.nextInt();
        sc.nextLine();
        while(k-->0){
            String s = sc.nextLine();
            for(Student x : arr){
                if(x.dn.equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}

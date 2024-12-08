/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J06003 {
    public static HashMap<Integer,String> map = new HashMap<>();
    static class Student implements Comparable<Student>{
        public String id,name,number;
        public int gr;
        public Student(String id, String name, String number, int gr) {
            this.id = id;
            this.name = name;
            this.number = number;
            this.gr = gr;
        }
        public String toString(){
            return this.id+" "+this.name+" "+this.number;
        }

        @Override
        public int compareTo(Student o) {
            return this.id.compareTo(o.id);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        int t = sc.nextInt();
        int k=sc.nextInt();
        while(t-->0){
            sc.nextLine();
            arr.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        sc.nextLine();
        for(int i=1;i<=k;i++){
            String s = sc.nextLine();
            map.put(i, s);
        }
        int h = sc.nextInt();
        for(int i=1;i<=h;i++){
            int x1 = sc.nextInt();
            String sl = map.get(x1);
            System.out.printf("DANH SACH NHOM %d:\n",i);
            for(Student x:arr){
                if(map.get(x.gr).equals(sl)){
                    System.out.println(x);
                }
            }
            System.out.printf("Bai tap dang ky: %s\n",sl);
        }
    }
}
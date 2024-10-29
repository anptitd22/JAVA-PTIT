/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class cau1 {
    static class Student{
        public String id,name,sex,nameClass,email,number,size;

        public Student(String id, String name, String sex, String nameClass, String email, String number) {
            this.id = id;
            this.name = name;
            this.sex = sex;
            this.nameClass = nameClass;
            this.email = email;
            this.number = number;
        }
        
        public String toString(){
            return this.id+", "+this.name+", "+this.sex+","+this.nameClass+", "+this.email+", "+this.number;
        }
    }
    public static HashMap<String,Student> map = new HashMap<>();
    public static void main(String[] args) throws IOException{
        File dis1 = new File("SINHVIEN.in");
        File dis2 = new File("DANGKY.in");
        Scanner sc = new Scanner(dis1);
        Scanner sc2 = new Scanner(dis2);
        Scanner sc3=new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String nameClass = sc.nextLine();
            String email = sc.nextLine();
            String number = sc.nextLine();
            Student x=new Student(id, name, sex, nameClass, email, number);
            map.put(id, x);
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student o1,Student o2){
                return o1.id.compareTo(o2.id);
            }
        });
//        for(String x:set){
//            System.out.println(x);
//            for(Student y:arr){
//                if(y.nameClass.equals(x)){
//                    System.out.println(y);
//                }
//            }
//        }
        while(sc2.hasNext()){
            map.get(sc2.next()).size=sc2.next();
        }
        int k = sc3.nextInt();
        while(k-->0){
            String s=sc3.next();
            String s5=s.toUpperCase();
            String s2=sc3.next();
            System.out.println("DANH SACH SINH VIEN "+s5+" DANG KY SIZE "+s2);
            for(Student y:arr){
                if(y.sex.equals(s)&&y.size.equals(s2)){
                    System.out.println(y);
                }
            }
        }
    }
}

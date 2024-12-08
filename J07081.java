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
public class J07081 {
    static class Student{
        public String id,fullname,number,address,name1,name2,name3;

        public Student(String id, String fullname, String number, String address) {
            this.id = id;
            this.fullname = fullname;
            this.number = number;
            this.address = address;
            String [] arr = fullname.split("\\s+");
            this.name1 = arr[arr.length-1];
            this.name2 = arr[0];
            this.name3="";
            for(int i=1;i<arr.length-1;i++){
                this.name3+=arr[i]+" ";
            }
            this.name3=this.name3.trim();
        }
        
        public String toString(){
            return this.id+" "+this.fullname+" "+this.number+" "+this.address;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Student> a = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.name1.equals(o2.name1)){
                    if(o1.name2.equals(o2.name2)){
                        if(o1.name3.equals(o2.name3)){
                            return o1.id.compareTo(o2.id);
                        }else{
                            return o1.name3.compareTo(o2.name3);
                        }
                    }else{
                        return o1.name2.compareTo(o2.name2);
                    }
                }else{
                    return o1.name1.compareTo(o2.name1);
                }
            }
        });
        for(Student x:a){
            System.out.println(x);
        }
    }
}

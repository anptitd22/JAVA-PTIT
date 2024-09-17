/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;
import java.io.*;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class J07033 {
    static class Student{
        public String id,name,className,email;

        public Student(String id,String name, String className,String email) {
            this.id=id;
            this.name = name;
            this.email = email;
            this.className=className;
        }

        public void chuanhoa(){
            String [] a= this.name.toLowerCase().split("\\s+");
            String res="";
            for(String x:a){
                res+=Character.toUpperCase(x.charAt(0));
                for(int j=1;j<x.length();j++){
                    res+=x.charAt(j);
                }
                res+=" ";
            }
            this.name=res.trim();
        }
        
        @Override
        public String toString(){
            chuanhoa();
            return this.id+" "+this.name+" "+this.className+" "+this.email;
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc= new Scanner(new File("SINHVIEN.in"));
        LinkedList<Student> arr= new LinkedList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            arr.add(new Student(sc.nextLine(),sc.nextLine().trim(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<Student>(){
            @Override
            public int compare (Student o1,Student o2){
                return o1.id.compareTo(o2.id);
            }
        });
        for(Student x:arr){
            System.out.println(x);
        }
    }
}

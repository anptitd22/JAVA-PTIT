/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.*;
/**
 *
 * @author ADMIN
 */
class Student{
    public String id,name,nameClass,birth;
    public float gpa;
    public static int number = 0;

    public Student(String name, String nameClass, String birth, float gpa) {
        this.number +=1;
        this.id = "B20DCCN"+String.format("%03d", this.number);
        this.name = name;
        this.nameClass = nameClass;
        this.birth = birth;
        this.gpa = gpa;
    }
    public void chuanhoa(){
        StringBuilder sb=new StringBuilder(this.birth);
        String [] arr= this.name.split("\\s+");
        if(sb.charAt(1)=='/'){
            sb.insert(0, "0");
        }
        if(sb.charAt(4)=='/'){
            sb.insert(3,"0");
        }
        this.birth=sb.toString();
        String res="";
        for(String x:arr){
            x=x.toLowerCase();
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
        return this.id+" "+this.name+" "+this.nameClass+" "+this.birth+" "+String.format("%.2f",this.gpa);
    }
    
}
public class J05004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Student>arr=new LinkedList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            Student x = new Student(sc.nextLine().trim(), sc.next(), sc.next(), sc.nextFloat());
            arr.add(x);
        }
        for(Student x:arr){
            System.out.println(x);
        }
    }
}

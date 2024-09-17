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
    public String name,birth;
    public float d1,d2,d3,tong;
    public int id;
    public static int number=0;

    public Student(String name, String birth, float d1, float d2, float d3) {
        this.number+=1;
        this.id = this.number;
        this.name = name;
        this.birth = birth;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong=d1+d2+d3;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.birth+" "+this.tong;
    }
}
public class J05009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Student> arr=new LinkedList<>();
        int n=sc.nextInt();
        float maxx=0;
        while(n-->0){
            sc.nextLine();
            Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            maxx=Math.max(a.tong,maxx);
            arr.add(a);
        }
        for(Student x: arr){
            if(x.tong==maxx){
                System.out.println(x);
            }
        }
    }
}

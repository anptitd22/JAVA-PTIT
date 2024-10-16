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
public class J05026 {
    public static String sb(String subject){
        String [] b = subject.split("\\s+");
        String res="";
        for (String x:b){
            res+=Character.toUpperCase(x.charAt(0));
        }
        return res;
    }
    static class Teacher{
        public String id,name,subject,firstName;
        public static int number = 0;

        public Teacher(String name, String subject) {
            this.number += 1;
            this.id = "GV"+String.format("%02d", this.number);
            this.name = name;
            String [] a = name.split("\\s+");
            this.firstName=a[a.length-1];
            this.subject = sb(subject);
        }
        
        public String toString(){
            return this.id +" "+ this.name +" "+this.subject;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            arr.add(new Teacher(sc.nextLine(), sc.nextLine()));
        }
        int k = sc.nextInt();
        sc.nextLine();
        while(k-->0){
            String s = sc.nextLine();
            s=sb(s);
            System.out.println("DANH SACH GIANG VIEN BO MON "+s+":");
            for(Teacher x:arr){
                if(x.subject.equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}

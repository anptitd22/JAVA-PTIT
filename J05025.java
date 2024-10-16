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
public class J05025 {
    static class Teacher{
        public String id,name,subject,firstName;
        public static int number = 0;

        public Teacher(String name, String subject) {
            this.number += 1;
            this.id = "GV"+String.format("%02d", this.number);
            this.name = name;
            String [] a = name.split("\\s+");
            this.firstName=a[a.length-1];
            String [] b = subject.split("\\s+");
            String res="";
            for (String x:b){
                res+=Character.toUpperCase(x.charAt(0));
            }
            this.subject = res;
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
        Collections.sort(arr,new Comparator<Teacher>(){
            @Override
            public int compare(Teacher o1,Teacher o2){
                if(o1.firstName.compareTo(o2.firstName)==0){
                    return o1.id.compareTo(o2.id);
                }else{
                    return o1.firstName.compareTo(o2.firstName);
                }
            }
        });
        for(Teacher x : arr){
            System.out.println(x);
        }
    }
}

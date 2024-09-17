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
public class J07034 {
    static class Subject{
        public String id,name;
        public int number;

        public Subject(String id, String name, int number) {
            this.id = id;
            this.name = name;
            this.number = number;
        }
        
        public String toString(){
            return this.id+" "+this.name+" "+this.number;
        }
            
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc= new Scanner (new File("MONHOC.in"));
        LinkedList<Subject> arr = new LinkedList<>();
        int t=sc.nextInt();
        while(t-->0){
            sc.nextLine();
            arr.add(new Subject(sc.nextLine(),sc.nextLine(),sc.nextInt()));
        }
        Collections.sort(arr,new Comparator<Subject>(){
            @Override
            public int compare(Subject o1,Subject o2){
                return o1.name.compareTo(o2.name);
            }
        });
        for(Subject x:arr){
            System.out.println(x);
        }
        sc.close();
    }
}

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
public class J07037 {
    static class enterprise{
        public String id,name;
        public int student; 

        public enterprise(String id, String name, int student) {
            this.id = id;
            this.name = name;
            this.student = student;
        }
        
        public String toString(){
            return this.id+" "+this.name+" "+this.student;
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc= new Scanner(new File("DN.in"));
        int t=sc.nextInt();
        LinkedList<enterprise> arr = new LinkedList<>();
        while(t-->0){
            sc.nextLine();
            arr.add(new enterprise(sc.nextLine(),sc.nextLine(),sc.nextInt()));
        }
        Collections.sort(arr,new Comparator<enterprise>(){
            @Override
            public int compare (enterprise o1,enterprise o2){
                return o1.id.compareTo(o2.id);
            }
        });
        for(enterprise x:arr){
            System.out.println(x);
        }
    }
}

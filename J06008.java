/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J06008 {
    public static HashMap<String,String>map = new HashMap<>();
    
    static class Teacher{
        public String name;
        ArrayList<String> subject;
        public double hours = 0;

        public Teacher(String name) {
            this.subject= new ArrayList<>();
            this.name = name;
        }
        
    }
    public static HashMap<String,Teacher> m = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            map.put(sc.next(), sc.nextLine().trim());
        }
        t = sc.nextInt();
        while(t-->0){
            m.put(sc.next(), new Teacher(sc.nextLine().trim()));
        }
        t = sc.nextInt();
        while(t-->0){
            Teacher x=m.get(sc.next());
            String id = sc.next();
            Double h = sc.nextDouble();
            x.subject.add(map.get(id)+" "+Double.toString(h));
            x.hours+=h;
        }
        Teacher x = m.get(sc.next());
        System.out.println("Giang vien: "+x.name);
        for(String y:x.subject){
            System.out.println(y);
        }
        System.out.printf("Tong: %.2f",x.hours);
    }
}

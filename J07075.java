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
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07075 {
    static class Subject{
        public String id,name;
        public int credit;

        public Subject(String id, String name, int credit) {
            this.id = id;
            this.name = name;
            this.credit = credit;
        } 
    }
    static class Class{
        public String id_class,name_subject;
        public int day,study;
        public String name_te,name_class;
        public static int number = 0;

        public Class(String id_subject, int day, int study, String name_te, String name_class) {
            number +=1;
            this.id_class=String.format("HP%03d", number);
            this.name_subject = id_subject;
            this.day = day;
            this.study = study;
            this.name_te = name_te;
            this.name_class = name_class;
        }
        public String toString(){
            return this.id_class+" "+this.name_subject+" "+this.day+" "+this.study+" "+this.name_class;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        HashMap<String,String>map = new HashMap<>();
        ArrayList<Class> arr = new ArrayList<>();
        int t= sc1.nextInt();
        while(t-->0){
            sc1.nextLine();
            String id_subject = sc1.nextLine();
            String name_subject = sc1.nextLine();
            int abc = sc1.nextInt();
            map.put(id_subject,name_subject);
        }
        int n = sc2.nextInt();
        sc2.nextLine();
        while(n-->0){
            String id_sub = sc2.nextLine();
            int day = sc2.nextInt();
            int study = sc2.nextInt();
            sc2.nextLine();
            String name_te = sc2.nextLine();
            String name_cl = sc2.nextLine();
            arr.add(new Class(map.get(id_sub), day, study, name_te, name_cl));
        }
        Collections.sort(arr, new Comparator<Class>() {
            @Override
            public int compare(Class o1, Class o2) {
                if(o1.day==o2.day){
                    if(o1.study==o2.study){
                        return o1.name_te.compareTo(o2.name_te);
                    }else{
                        return o1.study-o2.study;
                    }
                }else{
                    return o1.day-o2.day;
                }
            }
        });
        String s = sc2.nextLine();
        System.out.printf("LICH GIANG DAY GIANG VIEN %s:\n",s);
        for(Class x:arr){
            if(x.name_te.equals(s)){
                System.out.println(x);
            }
        }
    }
}

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
public class J07073 {
    static class Subject{
        public String code,name;
        public int number;
        public String live,url;

        public Subject(String code, String name, int number, String live, String url) {
            this.code = code;
            this.name = name;
            this.number = number;
            this.live = live;
            this.url = url;
        }
        
        public String toString(){
            return this.code+" "+this.name+" "+this.number+" "+this.live+" "+this.url;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String code = sc.nextLine();
            String name = sc.nextLine();
            int number = sc.nextInt();
            sc.nextLine();
            String live = sc.nextLine();
            String url = sc.nextLine();
            arr.add(new Subject(code, name, number, live, url));
        }
        Collections.sort(arr, new Comparator<Subject>(){
            @Override
            public int compare(Subject o1, Subject o2) {
                return o1.code.compareTo(o2.code);
            }
            
        });
        for(Subject x: arr){
            if(!x.url.equals("Truc tiep")){
                System.out.println(x);
            }
        }
    }
}

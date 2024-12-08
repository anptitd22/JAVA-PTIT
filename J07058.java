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
public class J07058 {
    static class Subject{
        public String code,name,form;

        public Subject(String code, String name, String form) {
            this.code = code;
            this.name = name;
            this.form = form;
        }
        
        public String toString(){
            return this.code+" "+this.name+" "+this.form;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        ArrayList<Subject> arr = new ArrayList<>();
        sc.nextLine();
        while(t-->0){
            arr.add(new Subject(sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim()));
        }
        Collections.sort(arr, new Comparator<Subject>(){
            @Override
            public int compare(Subject o1,Subject o2){
                return o1.code.compareTo(o2.code);
            }
        });
        for(Subject x:arr){
            System.out.println(x);
        }
    }
}

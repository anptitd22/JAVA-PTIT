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
public class J07072 {
    static class Name{
        public String name,code;
        public String name1,name2,name3;

        public Name(String name) {
            String [] a = name.split("\\s+");
            String res="";
            for(String x:a){
                res+=Character.toUpperCase(x.charAt(0));
                for(int i=1;i<x.length();i++){
                    res+=Character.toLowerCase(x.charAt(i));
                }
                res+=" ";
            }
            this.name = res.trim();
            String [] ab = this.name.split("\\s+");
            name1 = ab[ab.length-1];
            name2 = ab[0];
            for(int i=1;i<ab.length-1;i++){
                name3+=ab[i]+" ";
            }
            this.name3=this.name3.trim();
        }
        
        public String toString(){
            return this.name;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name> arr = new ArrayList<>();
        while(sc.hasNextLine()){
            arr.add(new Name(sc.nextLine().trim()));
        }
        
        Collections.sort(arr, new Comparator<Name>(){
            @Override
            public int compare(Name o1,Name o2){
                if(o1.name1.equals(o2.name1)){
                    if(o1.name2.equals(o2.name2)){
                        return o1.name3.compareTo(o2.name3);
                    }else{
                        return o1.name2.compareTo(o2.name2);
                    }
                }else{
                    return o1.name1.compareTo(o2.name1);
                }
            }
        });
        for(Name x:arr){
            System.out.println(x);
        }
    }
}

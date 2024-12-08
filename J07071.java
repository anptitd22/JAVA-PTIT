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
public class J07071 {
    static class Name{
        public String name,code;
        public String name1,name2;

        public Name(String name) {
            this.name = name;
            String [] a = name.split("\\s+");
            this.name1 = a[a.length-1];
            this.name2 = a[0];
            this.code ="";
            for(String x:a){
                this.code+=x.charAt(0);
            }
        }
        
        public boolean suit(String s){
            String[] a = s.split("['.']");
            if(a.length != this.code.length()) return false;
            for(int i=0;i<a.length;i++){
                if(a[i].charAt(0) == '*') continue;
                if(a[i].charAt(0) != this.code.charAt(i)) return false;
            }
            return true;
        }
        
        public String toString(){
            return this.name;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            arr.add(new Name(sc.nextLine().trim()));
        }
        
        Collections.sort(arr, new Comparator<Name>(){
            @Override
            public int compare(Name o1,Name o2){
                if(o1.name1.equals(o2.name1)){
                    return o1.name2.compareTo(o2.name2);
                }else{
                    return o1.name1.compareTo(o2.name1);
                }
            }
        });
        int k = sc.nextInt();
        while(k-->0){
            String s = sc.next();
            for(Name x: arr){
                if(x.suit(s)){
                    System.out.println(x);
                }
            }
        }
    }
}

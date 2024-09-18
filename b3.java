/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test06.test06;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        HashSet<String>set = new HashSet<>();
        TreeSet<String>arr1 = new TreeSet<>();
        TreeSet<String>arr2 = new TreeSet<>();
        TreeSet<String>arr3 = new TreeSet<>();
        String a=sc.nextLine();
        String b=sc.nextLine();
        String [] a1= a.split("\\s+");
        String [] b1= b.split("\\s+");
        for(String x:a1){
            arr1.add(x);
            set.add(x);
        }
        for(String x:b1){
            arr1.add(x);
            if(set.contains(x)){
                arr2.add(x);
            }else{
                arr3.add(x);
            }
        }
        if(arr1.size()!=0){
            for(String x:arr1){
                System.out.print(x+" ");
            }
            System.out.println("");
        }else{
            System.out.println("NONE");
        }
        if(arr2.size()!=0){
            for(String x:arr2){
                System.out.print(x+" ");
            }
            System.out.println("");
        }else{
            System.out.println("NONE");
        }
        if(arr3.size()!=0){
            for(String x:arr3){
                System.out.print(x+" ");
            }
            System.out.println("");
        }else{
            System.out.println("NONE");
        }
    }
}

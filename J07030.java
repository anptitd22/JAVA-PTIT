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
public class J07030 {
    public static boolean check(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }
    public static void main(String[] args)throws IOException,ClassNotFoundException{
        ObjectInputStream dis1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream dis2= new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) dis1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) dis2.readObject();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(Integer x:arr1){
            if (check(x)&&check(1000000-x)){
                if(x>500000) continue;
                if(!map.containsKey(x)){
                    map.put(x, 0);
                }
            }
        }
        for(Integer x:arr2){
            if(check(x)&&check(1000000-x)){
                if(map.containsKey(1000000-x)){
                    map.put(1000000-x,x);
                }
            }
        }
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            if(entry.getValue()!=0)
                System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}

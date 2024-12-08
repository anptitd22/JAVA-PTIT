/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ADMIN
 */
public class J07016 {
    public static boolean check(int x){
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                return false;
            }
        }
        return x>1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis1 = new FileInputStream("DATA1.in");
        ObjectInputStream dis1 = new ObjectInputStream(fis1);
        FileInputStream fis2 = new FileInputStream("DATA2.in");
        ObjectInputStream dis2 = new ObjectInputStream(fis2);
        ArrayList<Integer> arr1 = (ArrayList<Integer>)dis1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>)dis2.readObject();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(Integer x:arr1){
            if(check(x)){
                if(map1.containsKey(x)){
                    map1.put(x, map1.get(x)+1);
                }else{
                    map1.put(x, 1);
                }
            }
        }
        for(Integer x:arr2){
            if(check(x) && map1.containsKey(x)){
                if(map2.containsKey(x)){
                    map2.put(x, map2.get(x)+1);
                }else{
                    map2.put(x, 1);
                }
            }
        }
        
        for(int i=2;i<=10000;i++){
            if(map1.containsKey(i)&&map2.containsKey(i)){
                System.out.println(i+" "+map1.get(i)+" "+map2.get(i));
            }
        }
    }
}

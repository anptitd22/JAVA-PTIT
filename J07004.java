/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

/**
 *
 * @author ADMIN
 */
import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;
public class J07004 {
    public static void main(String[] args) {
        File file = new File("DATA.in");
        try{
            Scanner sc = new Scanner(file);
            TreeMap<Integer,Integer>map=new TreeMap<>();
            while(sc.hasNextInt()){
                int a=sc.nextInt();
                if(map.containsKey(a)){
                    map.put(a, map.get(a)+1);
                }else{
                    map.put(a, 1);
                }
            }
            Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();
            for(Map.Entry<Integer,Integer>entry:entrySet){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            sc.close();
        }catch(FileNotFoundException e){
            
        }
    }
}

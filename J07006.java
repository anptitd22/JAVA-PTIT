/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

/**
 *
 * @author ADMIN
 */
import java.io.*;
import java.util.*;
public class J07006 {
    public static void main(String[] args) {
        try{
            FileInputStream fis= new FileInputStream("DATA.in");
            ObjectInputStream dis= new ObjectInputStream(fis);
            TreeMap<Integer,Integer>map=new TreeMap<>();
            ArrayList<Integer> a= (ArrayList<Integer>) dis.readObject();
            for(Integer x:a){
                if(map.containsKey(x)){
                    map.put(x, map.get(x)+1);
                }else{
                    map.put(x, 1);
                }
            }
            Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();
            for(Map.Entry<Integer,Integer>entry:entrySet){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            fis.close();
        }catch(FileNotFoundException e){
            
        }catch(ClassNotFoundException | IOException e){
            
        }
    }
}

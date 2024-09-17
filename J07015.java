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
public class J07015 {
    public static boolean check(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        FileInputStream fis= new FileInputStream("SONGUYEN.in");
        ObjectInputStream dos = new ObjectInputStream(fis);
        ArrayList<Integer>arr = (ArrayList<Integer>) dos.readObject();
        TreeMap<Integer,Integer>map=new TreeMap<>();
        for(Integer x:arr){
            if(check(x)){
                if(map.containsKey(x)){
                    map.put(x, map.get(x)+1);
                }else{
                    map.put(x, 1);
                }
            }
        }
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry: entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}

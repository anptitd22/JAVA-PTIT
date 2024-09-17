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
public class J07029 {
    public static boolean check(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }
    public static void main(String[] args)throws IOException,ClassNotFoundException{
        ObjectInputStream dis = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) dis.readObject();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(Integer x:arr){
            if(check(x)){
                if(map.containsKey(x)){
                    map.put(x,map.get(x)+1);
                }else{
                    map.put(x,1);
                    a.add(x);
                }
            }
            
        }
        Collections.sort(a);
        Object [] b = a.toArray();
        for(int i=b.length-1; i>=b.length-10;i--){
            System.out.println(b[i]+" "+map.get(b[i]));
        }
    }
}

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
public class J07032 {
//    public static boolean le(Character n){
//        String res="13579";
//        for(int i=0;i<res.length();i++){
//            if(n==res.charAt(i)) return true;
//        }
//        return false;
//    }
    public static boolean check(Integer n){
        String res=Integer.toString(n);
        if(res.length()<=1 || res.length()%2==0) return false;
        int l=0,r=res.length()-1;
        int m=(r+l)/2;
        while(l<r){
            if((res.charAt(l)-'0')%2==0||(res.charAt(r)-'0')%2==0||res.charAt(l)!=res.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return (res.charAt(m)-'0')%2==1;
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream dis1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream dis2= new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) dis1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) dis2.readObject();
        ArrayList<Integer> arr = new ArrayList<>();
        TreeSet<Integer> set=new TreeSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer x:arr1){
            if(check(x)){
                if(map.containsKey(x)){
                    map.put(x,map.get(x)+1);
                }else{
                    map.put(x,1);
                }
            }
            
        }
        for(Integer x:arr2){
            if(check(x)){
                if(map.containsKey(x)){
                    map.put(x,map.get(x)+1);
                    set.add(x);
                }
            }
        }
        for(Integer x:set){
            arr.add(x);
        }
        for(int i=0;i<Math.min(10, arr.size());i++){
            System.out.println(arr.get(i)+" "+map.get(arr.get(i)));
        }
    }
}

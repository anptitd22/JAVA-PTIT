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
public class J07085 {
    public static void main(String[] args)throws IOException,ClassNotFoundException,NumberFormatException{
        ObjectInputStream fis = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>) fis.readObject();
        for(String x:arr){
            x=x.trim();
            String res="";
            long sum=0;
            for(int i=0;i<x.length();i++){
                if(Character.isDigit(x.charAt(i))){
                    sum+=(int)(x.charAt(i)-'0');
                    res+=x.charAt(i);
                }
            }
            res=res.replaceFirst("^0*","");
            if(res.isEmpty()) res="0";
            System.out.println(res+" "+sum);
        }
    }
}

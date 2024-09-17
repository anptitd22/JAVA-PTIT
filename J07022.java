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
public class J07022 {
    public static void main(String[] args) {
        File file = new File("DATA.in");
        try{
            Scanner sc= new Scanner(file);
            ArrayList<String>set= new ArrayList<>();
            while(sc.hasNext()){
                String s=sc.next();
                try{
                    int a=Integer.parseInt(s);
                }catch(NumberFormatException e){
                    set.add(s);
                }
            }
            Collections.sort(set);
            for(String x:set){
                System.out.print(x+" ");
            }
            sc.close();
        }catch(FileNotFoundException e){
            
        }
    }
}

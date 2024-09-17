/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
/**
 *
 * @author ADMIN
 */
public class J07002 {
    public static void main(String[] args){
        File file = new File("DATA.in");
        try{
            long sum=0;
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){    
                try{
                    String s= sc.next();
                    sum+=Integer.parseInt(s);
                }catch(NumberFormatException e){
                    
                }
            }
            System.out.println(sum);
        }catch(FileNotFoundException e){
            
        }
    }
}

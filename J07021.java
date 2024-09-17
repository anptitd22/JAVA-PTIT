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
public class J07021 {
    public static void main(String[] args)throws IOException{
        FileReader fr = new FileReader("DATA.in");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while(!(line=br.readLine()).equals("END")){
            line=line.trim().toLowerCase();
            String [] a =line.split("\\s+");
            String res="";
            for(String x:a){
                res+=Character.toUpperCase(x.charAt(0));
                for(int j=1;j<x.length();j++){
                    res+=x.charAt(j);
                }
                res+=" ";    
            }
            System.out.println(res.trim());
        }
    }
}

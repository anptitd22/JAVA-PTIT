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
public class J07007 {
    public static void main(String[] args) throws IOException,FileNotFoundException{
        FileReader fr = new FileReader("VANBAN.in");
        BufferedReader br = new BufferedReader(fr);
        String line;
        TreeSet<String> set = new TreeSet<>();
        while((line = br.readLine()) != null){
            String [] a = line.split("\\s+");
            for(String x:a){
                set.add(x.toLowerCase());
            }
        }
        for(String x:set){
            System.out.println(x);
        }
    }
}

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
public class J07040 {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        BufferedReader br = new BufferedReader(new FileReader("VANBAN.in"));
        ObjectInputStream fis2 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> ans = new ArrayList<>();
        HashSet<String>set= new HashSet<>();
        ArrayList<String>arr= (ArrayList<String>) fis2.readObject();
        String line;
        for(String x:arr){
            String [] a = x.trim().toLowerCase().split("\\s+");
            for(String y:a){
                set.add(y);
            }
        }
        while((line=br.readLine())!=null){
            String [] a=line.trim().toLowerCase().split("\\s+");
            for(String x:a){
                if(set.contains(x)){
                    ans.add(x);
                    set.remove(x);
                }
            }
        }
        for(String x:ans){
            System.out.println(x);
        }
    }
}

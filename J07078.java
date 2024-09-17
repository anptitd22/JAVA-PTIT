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
public class J07078 {
    public static void main(String[] args) throws FileNotFoundException,StringIndexOutOfBoundsException{
        Scanner sc = new Scanner(new File("STRING.in"));
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String a=sc.nextLine().trim();
            String b=sc.nextLine().trim();
            if(b.length()>a.length()){
                continue;
            }
            for(int i=0;i<a.length()-b.length()+1;i++){
                if(b.equals(a.substring(i,i+b.length()))){
                    System.out.print((i+1)+" ");
                }
            }
            System.out.println();
        }
    }
}

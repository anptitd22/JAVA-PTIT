/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;
import java.util.*;
import java.io.*;
/**
 *
 * @author ADMIN
 */
public class J07010 {
    public static String chuanhoa(String s){
        StringBuilder sb=new StringBuilder(s);
        if(sb.charAt(1)=='/'){
            sb.insert(0, "0");
        }
        if(sb.charAt(4)=='/'){
            sb.insert(3, "0");
        }
        return sb.toString();
    }
    public static void main(String[] args)throws FileNotFoundException{
        File file = new File("SV.in");
        Scanner sc = new Scanner(file);
        int t = sc.nextInt();
        String [] a = new String [5];
        for(int k =1;k<=t;k++){
            sc.nextLine();
            a[0]="B20DCCN"+String.format("%03d", k);
            for(int i=1;i<4;i++){
                a[i]=sc.nextLine();
            }
            a[3]=chuanhoa(a[3]);
            a[4]=String.format("%.2f",sc.nextDouble());
            System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]);
        }
        
    }
}

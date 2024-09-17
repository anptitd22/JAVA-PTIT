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
public class J07008 {
    public static void Try(int a[],int n,int p,int i,int k,String s,TreeSet<String>set){
        if(p>1) set.add(s.trim());
        if(i==n){
            return;
        }
        for(int j=i;j<n;j++){
            if(a[j]>k){
                Try(a,n,p+1,j+1,a[j],s+Integer.toString(a[j])+" ",set);
            }
        }
    }
    public static void main(String[] args) throws IOException,FileNotFoundException{
        File file = new File("DAYSO.in");
        Scanner sc = new Scanner(file);
        int n=sc.nextInt();
        TreeSet<String>set=new TreeSet<>();
        int [] a =new int [n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Try(a,n,0,0,-101,"",set);
        for(String x:set){
            System.out.println(x);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class J03036 {
    public static int cnt(String a[],int n){
        int minn = 1000;
        for(int i=0;i<n;i++){
            int res=0;
            for(int j=0;j<n;j++){
                if(j!=i){
                    String tmp=a[j];
                    while(!tmp.equals(a[i])){
                        tmp=tmp.substring(1,tmp.length())+tmp.charAt(0);
                        res+=1;
                        if(tmp.equals(a[j])){
                            return -1;
                        }
                    }      
                }
            }
            minn=Math.min(minn, res);
        }
        return minn;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] a= new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            a[i]=sc.nextLine();
        }
        System.out.println(cnt(a,n));
    }
}

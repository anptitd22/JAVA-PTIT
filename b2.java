/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test06.test06;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long m=sc.nextLong();
            int k = sc.nextInt();
            long [] b = new long [k+1];
            long [] a = new long [n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            for(int i=0;i<n;i++){
                if(i==k){
                    b[i]=m;
                    break;
                }
                b[i]=a[i];
            }
            if(k==n){
                b[k]=m;
            }
            Arrays.sort(b);
            for(int i=0;i<b.length;i++){
                System.out.print(b[i]+" ");
            }
            for(int i=k;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println("");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07076 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        while(sc.hasNext()){
            int t = sc.nextInt();
            while(t-->0){
                int n= sc.nextInt();
                int m = sc.nextInt();
                int k = sc.nextInt();
                int [][] a = new int[n][m];
                for(int i=0;i<n;i++){
                    for(int j = 0;j<m;j++){
                        a[i][j]=sc.nextInt();
                    }
                }
                int []b = new int[n];
                for(int i=0;i<n;i++) b[i]=a[i][k-1];
                Arrays.sort(b);
                for(int i=0;i<n;i++) a[i][k-1]=b[i];
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        System.out.printf(a[i][j]+" ");
                    }
                    System.out.println("");
                }
            }
        }
    }
}

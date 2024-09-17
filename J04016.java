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
class Matrix{
    public int n,m;
    public int [][] arr;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.arr = new int [n][m];
    }
    
    public Matrix nextMatrix(Scanner scanner){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                this.arr[i][j]=scanner.nextInt();
            }
        }
        return this;
    }
    
    public Matrix mul(Matrix b){
        Matrix c=new Matrix(this.n,b.m);
        for(int i=0;i<this.n;i++){
            for(int j=0;j<b.m;j++){
                for(int k=0;k<this.m;k++){
                    c.arr[i][j]+=this.arr[i][k]*b.arr[k][j];
                }
            }
        }
        return c;
    }
    public String toString(){
        String res="";
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res+=Integer.toString(this.arr[i][j])+" ";
            }
            res=res.trim();
            res+="\n";
        }
        return res;
    }
}
public class J04016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}

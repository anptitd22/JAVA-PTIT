package CODEPTIT;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
class IntSet{
    TreeSet<Integer>a;

    public IntSet(int [] arr) {
        a=new TreeSet<>();
        for(int i:arr)
            a.add(i);
    }
    
    public IntSet union(IntSet b){
        for(int i:b.a){
            this.a.add(i);
        }
        return this;
    }    
    @Override
    public String toString(){
        String s="";
        Object[] r=a.toArray();
        for(int i=0;i<r.length;i++){
            s+=r[i]+" ";
        }
        return s;
    }
}
public class J04021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}

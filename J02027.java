package JAVA.CODEPTITJV;

import java.util.Arrays;
import java.util.Scanner;
public class J02027 {
    public static int binary(int a[],int start,int end,int x){
        if(start>end) return start;
        int mid=(end+start)/2;
        if(a[mid]<x) return binary(a,mid+1,end,x);//upper:a[mid]<=x;
        return binary(a,start,mid-1,x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt(),k=sc.nextInt();
            int []a=new int [n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            long cnt=0;
            Arrays.sort(a);
            for(int i=0;i<n-1;i++){
                cnt+=(long)(binary(a,i+1,n-1, a[i]+k)-(i+1));
            }
            System.out.println(cnt);
            t--;
        }
    }
}

package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J02022 {
    public static int []X=new int [11];
    public static boolean []check=new boolean[11];
    public static int n;
    public static boolean check1(int a[],int n){
        for(int i=1;i<n;i++){
            if(a[i]-1==a[i+1]||a[i]+1==a[i+1]) return false;
        }
        return true;
    }
    public static void Result(){
        if(check1(X,n)){
            for(int i=1;i<=n;i++){
            System.out.print(X[i]);
            }
            System.out.println();
        }
    }
    public static void Try(int i){
        for(int j=1;j<=n;j++){
            if(check[j]){
                X[i]=j;
                check[j]=false;
                if(i==n) Result();
                else Try(i+1);
                check[j]=true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            for(int i=0;i<11;i++){
                check[i]=true;
            }
            n=sc.nextInt();
            for(int i=1;i<=n;i++){
                X[i]=i;
            }
            Try(1);
            t--;
        }
    }
}

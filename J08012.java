package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J08012 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int []cnt=new int [n+1]; 
    for(int t=0;t<n-1;t++){  
        int x=sc.nextInt(),y=sc.nextInt();
        cnt[x]++;
        cnt[y]++;
    }
    int dem=0;
    for(int i=1;i<=n;i++){
        if(cnt[i]==1) dem++;
    }
    if(dem==n-1){
        System.out.println("Yes");
    }else System.out.println("No");
}
}

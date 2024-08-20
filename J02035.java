package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J02035 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            long []a=new long [n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            int ok=1;
            for(int i=1;i<n;i++){
                if(a[i]<a[i-1]){
                    System.out.println(i);
                    ok=0;
                    break;
                }
            }
            if(ok==1) System.out.println(0);
            t--;
        }
    }
}

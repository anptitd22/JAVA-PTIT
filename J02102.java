package JAVA.CODEPTITJV;

import java.util.Arrays;
import java.util.Scanner;
public class J02102 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]a=new int [n][n];
        int []b=new int [n*n];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                b[cnt]=a[i][j];
                cnt++;
            }
        }
        Arrays.sort(b);
        cnt=0;
        int c1=0,c2=n-1,h1=0,h2=n-1;
        while(c1<=c2&&h1<=h2){
            for(int i=c1;i<=c2;i++){
                a[h1][i]=b[cnt++];
            }
            h1++;
            for(int i=h1;i<=h2;i++){
                a[i][c2]=b[cnt++];
            }
            c2--;
            if(h2>h1){
                for(int i=c2;i>=c1;i--){
                    a[h2][i]=b[cnt++];
                }
                h2--;
            }
            if(c2>c1){
                for(int i=h2;i>=h1;i--){
                    a[i][c1]=b[cnt++];
                }
                c1++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

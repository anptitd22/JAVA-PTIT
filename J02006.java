package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J02005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] a=new int [n];
        int [] b=new int [m];
        int [] cnt=new int [1001];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            cnt[a[i]]=1;
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            cnt[b[i]]=1;
        }
        for(int i=1;i<=1000;i++){
            if(cnt[i]==1) System.out.print(i+" ");
        }
    }
}

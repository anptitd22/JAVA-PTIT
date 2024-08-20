package JAVA.CODEPTITJV;
import java.util.Arrays;
import java.util.Scanner;
public class J02026 {
    public static int n,k;
    public static int []a=new int [100];
    public static int []b=new int [100];
    public static void Result(){
        for(int i=1;i<=k;i++){
            System.out.print(a[b[i]]+" ");
        }
        System.out.println();
    }
    public static void Try(int i){
        for(int j=b[i-1]+1;j<=n-k+i;j++){
            b[i]=j;
            if(i==k) Result();
            else Try(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            n=sc.nextInt();k=sc.nextInt();
            for(int i=0;i<100;i++) b[i]=0;
            for(int i=1;i<=n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a,0,n+1);
            Try(1);
            t--;
        }
    }
}

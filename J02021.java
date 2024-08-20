package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J02020 {
    public static int [] X=new int [11];
    public static int n,k,cnt;
    public static void Result(){
        for(int i=1;i<=k;i++){
            System.out.print(X[i]);
        }
        cnt++;
        System.out.print(" ");
    }
    public static void Try(int i){
        for(int j=X[i-1]+1;j<=n-k+i;j++){
            X[i]=j;
            if(i==k) Result();
            else Try(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        cnt=0;
        n=sc.nextInt();
        k=sc.nextInt();
        for(int i=1;i<=n;i++){
            X[i]=i;
        }
        Try(1);
        System.out.println();
        System.out.println("Tong cong co "+cnt+" to hop");
    }
}

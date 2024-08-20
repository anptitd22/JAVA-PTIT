package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J01007 {
    public static long [] fibo=new long [101];
    public static void fibonacci(){
        fibo[0]=0;
        fibo[1]=1;
        for(int i=2;i<101;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
    }
    public static int check(long n){
        for(int i=0;i<=100;i++){
            if(fibo[i]==n) return 1;
            else if(fibo[i]>n) return 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        fibonacci();
        while(t>0){
            long n=sc.nextLong();
            if(check(n)==1){
                System.out.println("YES");
            }else System.out.println("NO");
            t--;
        }
    }
}

package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J01022 {
    public static long[] fibo=new long [101];
    public static void fibonacci(){
        fibo[0]=fibo[1]=1L;
        for(int i=2;i<100;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
    }
    public static char  check(int n,long k){
        if(n==0) return '0';
        if(n==1) return '1';
        if(k<=fibo[n-2]) return check(n-2,k);
        return check(n-1,k-fibo[n-2]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        fibonacci();
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            System.out.println(check(n,k)+"");
            t--;
        }
    }
}

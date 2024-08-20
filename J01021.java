package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J01021 {
    public static final int MOD=1000000007;
    public static long np(long a,long b){
        if(b==0) return 1;
        long tmp=np(a,b/2);
        if(b%2==1) return ((tmp%MOD)*(tmp%MOD))%MOD*a%MOD;
        else return ((tmp%MOD)*(tmp%MOD))%MOD;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=20;
        while(t>0){
            long a=sc.nextLong(),b=sc.nextLong();
            if(a==0&&b==0) break;
            System.out.println(np(a,b));
            t--;
        }
    }
}

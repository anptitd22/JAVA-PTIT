package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J01009 {
    public static long factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=factorial(i);
        }
        System.out.println(sum);
    }
}

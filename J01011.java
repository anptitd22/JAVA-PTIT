package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J01011 {
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static long lcm(int a,int b){
        return 1l*a*b/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int a=sc.nextInt(),b=sc.nextInt();
            System.out.print(lcm(a,b)+" "+gcd(a,b));
            System.out.println();
            t--;
        }
    }
}

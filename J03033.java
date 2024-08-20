package JAVA.CODEPTITJV;
import java.math.BigInteger;
import java.util.Scanner;
public class J03033 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger res = a.gcd(b);
            res = (a.multiply(b)).divide(res);
            System.out.println(res);
            t--;
        }
    }
}

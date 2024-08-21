package JAVA.CODEPTITJV;

import java.math.BigInteger;
import java.util.Scanner;

public class J03018 {
    public static final BigInteger MODE=BigInteger.valueOf(5);
    public static BigInteger pow(BigInteger a,BigInteger b){
        if(b==BigInteger.ZERO) return BigInteger.ONE;
        BigInteger p=pow(a,b.divide(BigInteger.valueOf(2))).mod(MODE);
        if(b.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)) return (a.multiply(p).mod(MODE).multiply(p).mod(MODE)).mod(MODE);
        return (p.multiply(p)).mod(MODE); 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            BigInteger n=sc.nextBigInteger();
            int sum=0;
            for(int i=2;i<=4;i++){
                String s=pow(BigInteger.valueOf(i),n).toString();
                sum+=(s.charAt(s.length()-1)-'0');
            }
            sum+=1;
            System.out.println(sum%5);
        }
    }
}

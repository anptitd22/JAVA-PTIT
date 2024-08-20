package JAVA.CODEPTITJV;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            int max = Math.max(a.toString().length(), b.toString().length());
            String ans = a.subtract(b).abs().toString();
            while(ans.length()<max) ans = "0" + ans;
            System.out.println(ans);
        }
    }
}

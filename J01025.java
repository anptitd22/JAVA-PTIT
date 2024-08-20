package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J01025 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt(),b1=sc.nextInt(),a2=sc.nextInt(),b2=sc.nextInt();
        int a3=sc.nextInt(),b3=sc.nextInt(),a4=sc.nextInt(),b4=sc.nextInt();
        int c1=Math.max(Math.max(a1,a2),Math.max(a3,a4));
        int c2=Math.min(Math.min(a1,a2),Math.min(a3,a4));
        int d1=Math.max(Math.max(b1,b2),Math.max(b3,b4));
        int d2=Math.min(Math.min(b1,b2),Math.min(b3,b4));
        int ans=Math.max(c1-c2,d1-d2);
        System.out.println(ans*ans);
    }
}

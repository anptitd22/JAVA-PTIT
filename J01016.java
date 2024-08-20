package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J01016 {
    public static boolean check(long a){
        int dem=0;
        while(a>0){
            long res=a%10;
            a/=10;
            if(res==4||res==7) dem++;
        }
        return (dem==4||dem==7);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if(check(n)){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}

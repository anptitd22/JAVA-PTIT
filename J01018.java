package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J01018 {
    public static boolean check(long a){
        long res=a%10;
        long dem=res;
        a/=10;
        while(a>0){
            long res1=a%10;
            dem+=res1;
            a/=10;
            if(res1!=res-2&&res1!=res+2) return false;
            res=res1;
        }
        return (dem%10==0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            if(check(n)){
                System.out.println("YES");
            }else System.out.println("NO");
            t--;
        }
    }
}

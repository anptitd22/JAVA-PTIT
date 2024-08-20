package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J01010 {
    public static long catdoi(long n){
        long ans=0;
        long dem=0;
        while(n>0){
            long res=n%10;
            n/=10;
            if(res==1) ans+=Math.pow(10,dem);
            else if (res==2||res==3||res==4||res==5||res==6||res==7) return 0; 
            dem++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            if(catdoi(n)!=0){
                System.out.println(catdoi(n));
            }else System.out.println("INVALID");
            t--;
        }
    }
}

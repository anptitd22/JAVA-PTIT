package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J01024 {
    public static boolean check(int n){
        while(n>0){
            int res=n%10;
            if(res!=0&&res!=1&&res!=2) return false;
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
            t--;
        } 
    }
}

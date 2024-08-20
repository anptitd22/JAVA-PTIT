package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J02004 {
    public static boolean doixung(int a[],int n){
        for(int i=0;i<n;i++){
            if(a[i]!=a[n-i-1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int []dx=new int [n];
            for(int i=0;i<n;i++){
                dx[i]=sc.nextInt();
            }
            if(doixung(dx,n)){
                System.out.println("YES");
            }else System.out.println("NO");
            t--;
        }
    }
}

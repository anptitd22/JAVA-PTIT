package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J01006 {
    public static long []fibo=new long[93];
    public static void fibonacci(){
        fibo[0]=fibo[1]=1;
        for(int i=2;i<93;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        fibonacci();
        while(t>0){
            int n=sc.nextInt();
            System.out.println(fibo[n-1]);
            t--;
        }
    }
}

package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J01013 {
    public static int[]X=new int[2000001];
    public static void prime(){
        for(int i=2;i<Math.sqrt(2000001);i++){
            if(X[i]==0){
                for(int j=i;j<2000001;j+=i){
                    if(X[j]==0) X[j]=i;
                }
            }
        }
        for(int i=2;i<2000001;i++){
            if(X[i]==0) X[i]=i;
        }
    }
    public static int calc(int n){
        if(X[n]==0) return n;
        int sum=0;
        while(n!=1){
            sum+=X[n];
            n/=X[n];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long sum=0;
        prime();
        while(t>0){
            int n=sc.nextInt();
            sum+=calc(n);
            t--;
        }
        System.out.println(sum);
    }
}

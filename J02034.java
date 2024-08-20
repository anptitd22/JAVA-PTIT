package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J02034 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int []cnt=new int[201];
        int maxx=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            maxx=Math.max(maxx,a[i]);
            cnt[a[i]]=1;
        }
        int ok=1;
        for(int i=1;i<=maxx;i++){
            if(cnt[i]==0){
                System.out.println(i);
                ok=0;
            }
        }
        if(ok==1) System.out.println("Excellent!");
    }
}

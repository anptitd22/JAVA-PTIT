package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J02028 {
    public static boolean binary(long a[],int l,int r,long x){
        if(l>r) return false;
        int m=(l+r)/2;
        if(a[m]==x) return true; 
        else if(a[m]>x) return binary(a, l, m-1, x);
        else return binary(a, m+1, r, x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            long []a=new long [n+1];
            for(int i=1;i<=n;i++){
                a[i]=sc.nextLong();
                a[i]+=a[i-1];
            }
            int ok=0;
            if(a[n]==k){
                System.out.println("YES");
                ok=1;
            }else{
                for(int i=1;i<=n;i++){
                    if(binary(a, i, n, a[i-1]+k)){
                    System.out.println("YES");
                    ok=1;
                    break;
                }
                }
            }
            if(ok==0) System.out.println("NO");
            // for(int i=0;i<n;i++) System.out.print(a[i]+" ");
            t--;
        }
    }
}

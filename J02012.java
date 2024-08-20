package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J02012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int [n];
        int []cnt=new int [101];
        int maxx=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            maxx=Math.max(a[i],maxx);
            cnt[a[i]]++;
            System.out.print("Buoc "+i+": ");
            for(int j=1;j<=maxx;j++){
                int res=cnt[j];
                while(cnt[j]>=1){
                    System.out.print(j+" ");
                    cnt[j]--;
                }
                cnt[j]=res;
            }
            System.out.println();
        }
    }
}

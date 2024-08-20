package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J02014 {
    public static int check(int a[],int n){
        for(int i=0;i<n;i++){
            if(i!=0&&a[i-1]==a[n-1]-a[i]) return i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int []a= new int [n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(i!=0) a[i]+=a[i-1];
            }
            // for(int i=0;i<n;i++){
            //     System.out.print(a[i]+" ");
            // }
            System.out.println(check(a,n));
            t--;
        }
    }
}

package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J020356 {
    public static void maxx(int a[],int n,int s){
        for(int i=0;i<n;i++){
            if(s==0) break;
            else if(s>=9){
                a[i]=9;
                s-=9;
            }else{
                a[i]+=s;
                s=0;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void minn(int a[],int n,int s){
        if(n==1){
            System.out.print(s+" ");
            return;
        }
        s-=1;a[0]=1;
        for(int i=n-1;i>=0;i--){
            if(s==0) break;
            else if(s>=9){
                a[i]=9;
                s-=9;
            }else{
                a[i]+=s;
                s=0;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=sc.nextInt();
        int []a=new int [n];
        int []b=new int [n];
        if(s>9*n||(s==0&&n>1)){
            System.out.println("-1 -1");
        }else{
            minn(b,n,s);
            maxx(a,n,s);  
        }
    }
}

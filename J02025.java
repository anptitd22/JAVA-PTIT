package JAVA.CODEPTITJV;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class J02025 {
    public static int n;
    public static int []pri=new int [1000001];
    public static boolean []check=new boolean[1001];
    public static void prime(){
        pri[0]=pri[1]=0;
        for(int i=2;i<1000001;i++){
            pri[i]=1;
        }
        for(int i=2;i<=Math.sqrt(1000001);i++){
            if(pri[i]==1){
                for(int j=i*i;j<1000001;j+=i){
                    pri[j]=0;
                }
            }
        }
    }
    public static Integer []a=new Integer [16];
    public static void Try(int index,int k){
        if(pri[k]==1){
            for(int i=0;i<n;i++){
                if(check[a[i]]==false){
                    System.out.print(a[i]+" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=index;i--){
            if(check[a[i]]==true){
                check[a[i]]=false;
                if(i<n) Try(i+1,k+a[i]);
                check[a[i]]=true;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        prime();
        while(t>0){
            for(int i=0;i<1001;i++){
                check[i]=true;
            }
            n=sc.nextInt();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a,0,n,new Comparator<Integer>() {
                @Override
                public int compare(Integer o1,Integer o2){
                    if(o1>o2) return -1;
                    else return 1;
                }
            });
            Try(0,0);
            t--;
        }
    }
}

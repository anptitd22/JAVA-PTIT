package JAVA.CODEPTITJV;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class J02024 {
    public static int n;
    public static Integer [] a= new Integer [16];
    public static boolean []check=new boolean [101];
    // public static Integer [][][] sapxep = new Integer[1000001][101][16];
    public static void Try(int i,int k){
        if(k%2==1){
            int dem=0;
            for(int j=0;j<n;j++){
                if(check[a[j]]==false){
                    System.out.print(a[j]+" ");
                }
            }
            System.out.println();
        }
        for(int j=n-1;j>=i;j--){
            if(check[a[j]]==true){
                check[a[j]]=false;
                if(j<n) Try(j+1,k+a[j]);
                check[a[j]]=true;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            for(int i=0;i<=100;i++) check[i]=true;
            // for(int i=0;i<100;i++){
            //     for(int j=0;j<100;j++) sapxep[i][j]=0;
            // }
            n=sc.nextInt();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a,0,n,new Comparator<Integer>(){
                @Override
                public int compare(Integer o1,Integer o2){
                    if(o1>o2) return -1;
                    else return 1;
                }
            });
            // Arrays.sort(a,0,n);
            Try(0,0);
            // for(int i=0;i<a1;i++){
            //     for(int j=0;j<a2;j++){
            //         if(sapxep[i][j]!=0) System.out.print(sapxep[i][j]+" ");
            //     }
            //     System.out.println();
            // }
            t--;
        }
    }
}
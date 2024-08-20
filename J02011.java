package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J02011 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int key=i;
            int minn=a[i];
            for(int j=i+1;j<n;j++){
                if(minn>a[j]){
                    minn=a[j];
                    key=j;
                }
            }
            if(i!=key){
                int tmp=a[i];
                a[i]=a[key];
                a[key]=tmp;
            }
            System.out.print("Buoc "+(i+1)+": ");
            for(int j=0;j<n;j++) System.out.print(a[j]+" ");
            System.out.println();
        }
    }
}

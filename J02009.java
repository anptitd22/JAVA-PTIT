package JAVA.CODEPTITJV;
import java.util.Arrays;
import java.util.Scanner;
public class J02009 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int [n];
        int []b=new int [1000001];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[a[i]]=sc.nextInt();
        }
        Arrays.sort(a);
        int res=0;
        for(int i=0;i<n;i++){
            if(res<=a[i]){
                res=a[i]+b[a[i]];
            }else{
                res+=b[a[i]];
            }
        }
        System.out.println(res);
    }
}

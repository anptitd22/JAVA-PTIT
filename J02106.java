package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J02106 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]a=new int [n][3];
        int [][]cnt=new int [n][3];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
                cnt[i][a[i][j]]++;
            }
            if(cnt[i][1]>cnt[i][0]) ans++;
        }
        System.out.println(ans); 
    }
}

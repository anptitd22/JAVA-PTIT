package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J02103 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int q=1;q<=t;q++){
            int n=sc.nextInt(),m=sc.nextInt();
            long [][]a=new long [n][m];
            long [][]b=new long [m][n];
            long [][]c=new long [n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=sc.nextLong();
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    b[j][i]=a[i][j];
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    c[i][j]=0;
                    for(int k=0;k<m;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Test "+q+":");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

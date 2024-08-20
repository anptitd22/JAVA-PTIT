package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J01004 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t>0){
            boolean ok=false;
            int n=sc.nextInt();
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    System.out.println("NO");
                    ok=true;
                    break;
                }
            }
            if(ok==false) System.out.println("YES");
            t--;
        }
    }
}

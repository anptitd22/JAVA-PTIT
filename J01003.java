package JAVA.CODEPTITJV;
import java.util.Scanner;
public class J01003 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        if(a!=0){
            System.out.printf("%.2f",-b/a);
        }else{
            if(b==0){
                System.out.printf("VSN");
            }else{
                System.out.printf("VN");
            }
        }
    }
}

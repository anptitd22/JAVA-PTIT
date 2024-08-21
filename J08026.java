package JAVA.CODEPTITJV;
import java.util.*;

public class J08026 {
    static class pair{
        int x,y;
    }
    public static int biendoi(int s,int t){
        if(s>t) return s-t;
        if(t%2==1) return 1+biendoi(s,t+1);
        return 1+biendoi(s,t>>1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            int s=sc.nextInt();
            int t=sc.nextInt();
            System.out.println(biendoi(s,t));
        }
    }
}

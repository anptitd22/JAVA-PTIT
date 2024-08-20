package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J03025 {
    public static boolean check(String s){
        int l=0,r=s.length()-1;
        int m=(l+r)/2;
        int ok=1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                if(ok==0) return false;
                ok=0;
            }
            l++;r--;
        }
        if(ok==1&&s.length()%2==1) return true;
        else if(ok==0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            if(check(s)){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}

package JAVA.CODEPTITJV;

import java.util.Scanner;
public class J03006 {
    public static boolean check(String s){
        int l=0,r=s.length()-1;
        int m=(l+r)/2;
        while(r>l){
            if(s.charAt(r)!=s.charAt(l)) return false;
            if((s.charAt(r)-'0')%2==1||(s.charAt(l)-'0')%2==1) return false;
            r--;l++;
        }
        return ((s.charAt(m)-'0')%2==0);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            String s=sc.nextLine();
            if(check(s)){
                System.out.println("YES");
            }else System.out.println("NO");
            t--;
        }
    }
}

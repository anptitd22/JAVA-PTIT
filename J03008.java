package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J03008 {
    public static boolean nt(int n){
        return (n==3||n==2||n==5||n==7);
    }
    public static boolean check(String s){
        int l=0,r=s.length()-1;
        int m=(l+r)/2;
        int sum=0;
        while(r>l){
            if(s.charAt(r)!=s.charAt(l)) return false;
            if(!nt(s.charAt(r)-'0')||!nt(s.charAt(l)-'0')) return false;
            r--;l++;
        }
        return nt(s.charAt(m)-'0');
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

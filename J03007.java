package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J03007 {
    public static boolean check(String s){
        int l=0,r=s.length()-1;
        if(s.charAt(l)!='8'||s.charAt(r)!='8') return false;
        int m=(l+r)/2;
        int sum=0;
        while(r>l){
            if(s.charAt(r)!=s.charAt(l)) return false;
            sum+=(s.charAt(r)-'0')+(s.charAt(l)-'0');
            r--;l++;
        }
        if(s.length()%2==1){
            sum+=(s.charAt(m)-'0');
        }
        return sum%10==0;
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

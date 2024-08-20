package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J03028 {
    public static int val(String s){
        int res=0;
        for(int i=0;i<s.length();i++){
            res+=(s.charAt(i)-'A');
        }
        return res;
    }
    public static String drm(String s){
        int v=val(s);
        String r="";
        for(int i=0;i<s.length();i++){
            r+=(char)((s.charAt(i)-'A'+v)%26+'A');
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String s1=s.substring(0,s.length()/2);
            String s2=s.substring(s.length()/2);
            s1=drm(s1);
            s2=drm(s2);
            String r="";
            for(int i=0;i<s1.length();i++){
                r+=(char)((s1.charAt(i)-'A'+s2.charAt(i)-'A')%26+'A');
            }
            System.out.println(r);
        }
    }
}

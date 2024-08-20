package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J01023 {
    public static String s="",ans="";
    public static int ok=0;
    public static char[] dau={'+','-'};
    public static boolean solve(String r){
        int x=(r.charAt(0)-'0')*10+(r.charAt(1)-'0');
        int y=(r.charAt(5)-'0')*10+(r.charAt(6)-'0');
        int z=(r.charAt(10)-'0')*10+(r.charAt(11)-'0');
        if(x<10||y<10||z<10) return false;
        if(r.charAt(3)=='+') return x+y==z;
        else return x-y==z;
    }
    public static void Try(int i,String s1){
        if(ok==1) return;
        if(s1.length()==s.length()){
            if(solve(s1)){
                System.out.println(s1);
                ok=1;
            }
            return;
        }
        if(s.charAt(i)=='?'){
            if(i==3){
                for(int k=0;k<=1;k++){
                    Try(i+1,s1+dau[k]);
                }
            }else{
                for(int k=0;k<=9;k++){
                    Try(i+1,s1+(char)(k+'0'));
                }
            }
        }else Try(i+1,s1+s.charAt(i));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            s=sc.nextLine();
            ok=0;
            ans="";
            if(s.charAt(3)=='/'||s.charAt(3)=='*'){
                System.out.println("WRONG PROBLEM!");
            }else{
                Try(0,"");
                if(ok==0) System.out.println("WRONG PROBLEM!");
            }    
        }
    }
}

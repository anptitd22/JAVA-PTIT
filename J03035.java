package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J03035 {
    public static String a="",b="";
    public static long check(int i,long sum,int ok,int fine){
        if(i==a.length()){
            if(ok==0) return 0;
            else return sum;
        }
        if(a.charAt(i)=='?'){
            if(fine==1){
                return check(i+1,sum*10,1,fine);
            }else{
                if(b.charAt(i)<'9'){
                    long res=('9'-b.charAt(i))*1l;
                    return check(i+1,sum*res,1,1)+ check(i+1,sum,ok,0);
                }else return check(i+1,sum,ok,fine);
            }
        }else{
            if(fine==1){
                return check(i+1,sum,ok,fine);
            }else{
                if(a.charAt(i)-'0'>b.charAt(i)-'0'){
                    return check(i+1,sum,1,1);
                }else if(a.charAt(i)-'0'==b.charAt(i)-'0'){
                    return check(i+1,sum,ok,fine);
                }else{
                    return 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            a=sc.nextLine();
            b=sc.nextLine();
            System.out.println(check(0,1,0,0));
        }
    }
}

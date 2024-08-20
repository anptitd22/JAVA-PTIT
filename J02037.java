package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J02037 {
    public static boolean check(String a[]){
        int demc=0,deml=0;
        for(int i=0;i<a.length;i++){
            if(Integer.parseInt(a[i])%2==0) demc++;
            else deml++;
        }
        if(a.length%2==0&&(demc>deml)) return true;
        else if(a.length%2==1&&(deml>demc)) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String [] a=s.split("\\s+");
            if(check(a)){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}

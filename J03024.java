package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J03024 {
    public static int check(String s){
        int deml=0,demc=0;
        if(s.charAt(0)=='0') return -1;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                if((s.charAt(i)-'0')%2==0){
                    demc++;
                }else deml++;
            }else return -1;
        }
        if(demc>deml&&s.length()%2==0) return 1;
        else if(deml>demc&&s.length()%2==1) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            if(check(s)==-1){
                System.out.println("INVALID");
            }else if(check(s)==1){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}

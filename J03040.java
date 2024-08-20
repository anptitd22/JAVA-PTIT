package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J03040 {
    public static boolean check1(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)>=s.charAt(i+1)) return false;
        }
        return true;
    }
    public static boolean check2(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)) return false;
        }
        return true;
    }
    public static boolean check3(String s){
        return (s.charAt(0)==s.charAt(1)&&s.charAt(1)==s.charAt(2))&&(s.charAt(3)==s.charAt(4));
    }
    public static boolean check4(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='6'&&s.charAt(i)!='8') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            StringBuilder sb=new StringBuilder(s.substring(5));
            sb.deleteCharAt(3);
            if(check1(sb.toString())||check2(sb.toString())||check3(sb.toString())||check4(sb.toString())){
                System.out.println("YES");
            }else System.out.println("NO");
        }
        
    }
}

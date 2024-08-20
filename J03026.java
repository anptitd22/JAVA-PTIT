package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J03026 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String s2=sc.nextLine();
            if(s.compareTo(s2)==0){
                System.out.println("-1");
            }else{
                if(s.length()==s2.length()){
                    System.out.println(s.length());
                }else{
                    System.out.println(Math.max(s.length(),s2.length()));
                }
            }  
        }
    }
}

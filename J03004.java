package JAVA.CODEPTITJV;

import java.util.Scanner;
public class J03004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            String s=sc.nextLine();
            s=s.trim();
            StringBuilder sb=new StringBuilder("");
            String []a=s.split("\\s+");
            // for(String x:a){
            //     System.out.println(x);
            // }
            for(String x:a){
                sb.append(Character.toUpperCase(x.charAt(0)));
                for(int j=1;j<x.length();j++){
                    sb.append(Character.toLowerCase(x.charAt(j)));
                }
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString());
            t--;
        }
    }
}

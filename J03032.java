package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String [] a=s.split("\\s+");
            for(int i=0;i<a.length;i++){
                StringBuilder sb=new StringBuilder(a[i]);
                sb=sb.reverse();
                if(i!=a.length-1) sb.append(" ");
                System.out.print(sb.toString());
            }
            System.out.println();
        }
    }
}

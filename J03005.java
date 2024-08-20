package JAVA.CODEPTITJV;

import java.util.Scanner;
public class J03005 {
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
            String res="";
            for(int i=0;i<a.length;i++){
                sb.append(Character.toUpperCase(a[i].charAt(0)));
                for(int j=1;j<a[i].length();j++){
                    sb.append(Character.toLowerCase(a[i].charAt(j)));
                }
                if(i==0){
                    res=sb.toString().toUpperCase();
                    sb=sb.delete(0, sb.length());
                }else sb.append(" ");
                
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.print(sb.toString()+", ");
            System.out.println(res);
            t--;
        }
    }
}

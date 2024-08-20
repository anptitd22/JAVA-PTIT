package JAVA.CODEPTITJV;

import java.util.HashSet;
import java.util.Scanner;

public class J03031 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            HashSet<Character>set=new HashSet<>();
            String s=sc.next();
            int k=sc.nextInt();
            for(int i=0;i<s.length();i++){
                set.add(s.charAt(i));
            }
            if(set.size()+k-26>=0&&s.length()>=26){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}

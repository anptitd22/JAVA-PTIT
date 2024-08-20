package JAVA.CODEPTITJV;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            HashSet<String> set=new HashSet<>();
            String s=sc.nextLine();
            String s1=sc.nextLine();
            String [] a=s1.split("\\s+");
            for(int i=0;i<a.length;i++){
                set.add(a[i]);
            }
            String [] b=s.split("\\s+");
            Arrays.sort(b);
            for(int i=0;i<b.length;i++){
                if(!set.contains(b[i])){
                    System.out.print(b[i]+" ");
                    set.add(b[i]);
                }
            }
            System.out.println();
            t--;
        }
    }
}

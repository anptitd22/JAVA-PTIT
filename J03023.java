package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J03023 {
    public static int[] val ={1,5,10,50,100,500,1000};
    public static String lama="IVXLCDM";
    public static int solve(String s){
        int res=val[lama.indexOf(s.charAt(s.length()-1))];
        for(int i=s.length()-1;i>0;i--){
            int pos1=lama.indexOf(s.charAt(i));
            int pos2=lama.indexOf(s.charAt(i-1));
            if(val[pos1]<=val[pos2]){
                res+=val[pos2];
            }else res-=val[pos2];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            System.out.println(solve(s));
        }
    }
}

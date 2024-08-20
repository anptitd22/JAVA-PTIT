package JAVA.CODEPTITJV;

import java.util.Scanner;

public class J03021 {
    public static int number(char c1){
        if(c1=='a'||c1=='b'||c1=='c') return 2;
        else if(c1=='d'||c1=='e'||c1=='f') return 3;
        else if(c1=='g'||c1=='h'||c1=='i') return 4;
        else if(c1=='j'||c1=='k'||c1=='l') return 5;
        else if(c1=='m'||c1=='n'||c1=='o') return 6;
        else if(c1=='p'||c1=='q'||c1=='r'||c1=='s') return 7;
        else if(c1=='t'||c1=='u'||c1=='v') return 8;
        else if(c1=='w'||c1=='x'||c1=='y'||c1=='z') return 9;
        else return 0;
    }
    public static boolean check(String s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(number(s.charAt(r))!=number(s.charAt(l))) return false;
            l++;r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine().toLowerCase();
            if(check(s)){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}

package JAVA.CODEPTITJV;

import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    public static boolean check(char a,char b){
        if(a=='['&&b==']') return true;
        else if(a=='('&&b==')') return true;
        else if(a=='{'&&b=='}') return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            Stack<Character>st=new Stack<>();
            String s=sc.nextLine();
            for(int i=0;i<s.length();i++){
                if(st.isEmpty()){
                    st.add(s.charAt(i));
                }else{
                    if(check(st.peek(),s.charAt(i))){
                        st.pop();
                    }else{
                        st.add(s.charAt(i));
                    }
                }
            }
            if(st.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

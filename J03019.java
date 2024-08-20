package JAVA.CODEPTITJV;

import java.util.Scanner;
import java.util.Stack;

public class J03019 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.add(s.charAt(i));
            }else{
                while(!st.isEmpty()&&st.peek()<s.charAt(i)){
                    st.pop();
                }
                st.add(s.charAt(i));
            }
        }
        String res="";
        while(!st.isEmpty()){
            res=st.peek()+res;
            st.pop();
        }
        System.out.println(res);                                         
    }
}

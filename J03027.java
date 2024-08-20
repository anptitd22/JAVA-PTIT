package JAVA.CODEPTITJV;

import java.util.Scanner;
import java.util.Stack;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Character>st=new Stack<>();
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.add(s.charAt(i));
            }else{
                if(st.peek()==s.charAt(i)){
                    st.pop();
                }else{
                    st.add(s.charAt(i));
                }
            }
        }
        
        if(st.isEmpty()){
            System.out.println("Empty String");
        }else{
            String res="";
            while(!st.isEmpty()){
                res=st.peek()+res;
                st.pop();
            }
            System.out.println(res);
        }
        
    }
}

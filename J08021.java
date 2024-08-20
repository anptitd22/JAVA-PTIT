package JAVA.CODEPTITJV;

import java.util.Scanner;
import java.util.Stack;

public class J08021 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            Stack<Integer>st=new Stack<>();
            int maxx=0;
            st.add(-1);
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    st.add(i);
                }else{
                    if(st.isEmpty()){
                        st.add(i);
                    }else{
                        st.pop();
                        if(!st.isEmpty()) maxx=Math.max(maxx,i-st.peek());
                        else st.add(i);
                    }
                }
            }
            System.out.println(maxx);
        }
    }
}

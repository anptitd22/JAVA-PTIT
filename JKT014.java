package JAVA.CODEPTITJV;

import java.util.Scanner;
import java.util.Stack;

public class JKT014 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []a=new int [n+1];
            for(int i=1;i<=n;i++) a[i]=sc.nextInt();
            Stack<Integer>st=new Stack<>();
            for(int i=1;i<=n;i++){
                while(!st.isEmpty()&&a[st.peek()]<=a[i]){
                    st.pop();
                }
                if(st.isEmpty()) System.out.print(i+" ");
                else System.out.print(i-st.peek()+" ");
                st.add(i);
            }
            System.out.println();
        }
    }
}

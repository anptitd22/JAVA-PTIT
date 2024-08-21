package JAVA.CODEPTITJV;

import java.util.Scanner;
import java.util.Stack;

public class J08023 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Stack<Integer>st=new Stack<>();
            int n=sc.nextInt();
            int [] a=new int[n];
            int [] l=new int[n];
            int [] r=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                while(!st.isEmpty()&&a[st.peek()]>=a[i]){
                    st.pop();
                }
                if(st.isEmpty()) l[i]=0;
                else l[i]=st.peek()+1;
                st.add(i);
            }
            st.clear();
            for(int i=n-1;i>=0;i--){
                while(!st.isEmpty()&&a[st.peek()]>=a[i]){
                    st.pop();
                }
                if(st.isEmpty()) r[i]=n-1;
                else r[i]=st.peek()-1;
                st.add(i);
            }
            long sum=0;
            for(int i=0;i<n;i++){
                sum=Math.max(sum,1l*a[i]*(r[i]-l[i]+1));
            }
            System.out.println(sum);
        }
    }
}

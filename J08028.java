package JAVA.CODEPTITJV;

import java.util.Scanner;
import java.util.Stack;

public class J08028 {
    public static long S(int a[],int n){
        Stack<Integer>st=new Stack<>();
        int [] l=new int[n];
        int [] r=new int[n];
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
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] a=new int[m];
        int [] b=new int[m];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
            b[i]=n-a[i];
        }
        System.out.println(Math.max(S(a,m),S(b,m)));
    }
}

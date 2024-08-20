package JAVA.CODEPTITJV;
import java.util.Scanner;
import java.util.Stack;
public class J08022 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Stack<Integer>st=new Stack<>();
            int n=sc.nextInt();
            int []a=new int [n];
            int []b=new int [n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                b[i]=-1;
            }
            for(int i=n-1;i>=0;i--){
                while(!st.isEmpty()&&a[st.peek()]<=a[i]){
                    st.pop();
                }
                if(!st.empty()) b[i]=a[st.peek()];
                st.add(i);
            }
            for(int x:b) System.out.print(x+" ");
            System.out.println();
        }
    }
}

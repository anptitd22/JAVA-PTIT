package JAVA.CODEPTITJV;
import java.util.Scanner;
import java.util.Stack;
public class J02017 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int [n];
        Stack st=new Stack<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(st.empty()){
                st.push(a[i]);
            }else{
                if((a[i]+(int)st.peek())%2==0){
                    st.pop();
                }else{
                    st.push(a[i]);
                }
            }
        }
        System.out.println(st.size());
    }
}

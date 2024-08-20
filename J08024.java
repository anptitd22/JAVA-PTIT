package JAVA.CODEPTITJV;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int ok=0;
            int n=sc.nextInt();
            Queue<Integer>q=new LinkedList<Integer>();
            q.offer(9);
            while(!q.isEmpty()){
                int x=q.peek();
                q.poll();
                if(x%n==0){
                    System.out.println(x);
                    break;
                }
                int a=x*10;
                int b=x*10+9;
                q.offer(a);
                q.offer(b);
            }
        }
    }
}

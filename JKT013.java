package JAVA.CODEPTITJV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class JKT013 {
    public static ArrayList<String>a=new ArrayList<>();
    public static void slp(String s,int n){
        if(s.length()==n+1) return;
        slp(s+'8',n);
        slp(s+'6',n);
        if(s!="") a.add(s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            a.clear();
            // int n=sc.nextInt();
            // ArrayList<Integer>arr=new ArrayList<>();
            // Queue<Integer>q=new LinkedList<>();
            // q.offer(6);
            // q.offer(8);
            // while(true){
            //     int x=q.peek();q.poll();
            //     if(x>Math.pow(10,n)){
            //         break;
            //     }
            //     arr.add(x);
            //     int a=x*10+6;
            //     q.offer(a);
            //     int b=x*10+8;
            //     q.offer(b);
            // }
            // System.out.println(arr.size());
            // Collections.reverse(arr);
            // for(int x:arr) System.out.print(x+" ");
            // System.out.println();
            int n=sc.nextInt();
            slp("",n);
            Collections.sort(a,new Comparator<String>() {
                @Override
                public int compare(String o1,String o2){
                    if(o1.length()!=o2.length()) return o2.length()-o1.length();
                    else{
                        if(o1.compareTo(o2)>0) return -1;
                        else return 1;
                    }
                }
            });
            System.out.println(a.size());
            for(String x:a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}

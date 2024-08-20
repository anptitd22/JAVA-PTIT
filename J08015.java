package JAVA.CODEPTITJV;

import java.util.HashMap;
import java.util.Scanner;

public class J08015 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            long []a=new long [n];
            HashMap<Long,Long>map=new HashMap<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            long cnt=0;
            for(int i=0;i<n;i++){
                // System.out.println(map.containsKey(k-a[i]));
                if(map.containsKey(k-a[i])){
                    cnt+=(long)map.get(k-a[i]);   
                }
                map.put(a[i],map.getOrDefault(a[i], 0l)+1l);
            }
            System.out.println(cnt);
            t--;
        }
    }
}

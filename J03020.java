package JAVA.CODEPTITJV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
public class J03020 {
    public static boolean check(String s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(r)!=s.charAt(l)) return false;
            l++;r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int idx=0;
        HashMap<String,Integer>map=new HashMap<>();
        ArrayList<String>arr=new ArrayList<>();
        while(sc.hasNext()){
            String s=sc.next();
            if(!check(s)) continue;
            idx=Math.max(idx,s.length());
            if(map.containsKey(s)){
                int ts=map.get(s);
                ts++;
                map.put(s, ts);
            }else{
                map.put(s,1);
                arr.add(s);
            }
        }
        Collections.sort(arr,new Comparator<String>() {
            @Override
            public int compare(String o1,String o2){
                return o2.length()-o1.length();
            }
        });
        for(String x:arr){
            if(x.length()==idx){
                System.out.println(x+" "+map.get(x));
            }
        }
    }
}

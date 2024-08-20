package JAVA.CODEPTITJV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
public class J08011 {
    public static boolean check(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i+1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer>map=new HashMap<>();
        ArrayList<String>a=new ArrayList<>();
        while(sc.hasNext()){
            String s=sc.next();
            if(!check(s)) continue;
            if(map.containsKey(s)){
                int ts=map.get(s);
                ts++;
                map.put(s, ts);
            }else{
                map.put(s,1);
                a.add(s);
            }
            Collections.sort(a,new Comparator<String>(){
                @Override
                public int compare(String o1,String o2){
                    return map.get(o2)-map.get(o1);
                }
            });
        }
        for(String x:a) System.out.println(x+" "+map.get(x));
    }
}

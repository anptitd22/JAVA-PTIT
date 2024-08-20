package JAVA.CODEPTITJV;

import java.util.HashMap;
import java.util.Scanner;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer>map=new HashMap<>();
        while(t>0){
            String s=sc.nextLine().toLowerCase();
            s=s.trim();
            StringBuilder sb=new StringBuilder();
            String [] a=s.split("\\s+");
            sb.append(a[a.length-1]);
            for(int i=0;i<a.length-1;i++){
                sb.append(a[i].charAt(0));
            }
            sb.append("@ptit.edu.vn");
            if(map.containsKey(sb.toString())){
                int cnt=map.get(sb.toString());
                cnt++;
                map.put(sb.toString(),cnt);
                sb.insert(sb.length()-12,map.get(sb.toString()));
            }else{
                map.put(sb.toString(),1);
            }
            System.out.println(sb.toString());
            t--;
        }
    }
}

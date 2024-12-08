/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J05056 {
    static class Player implements Comparable<Player>{
        public String id,name,birth,start,end;
        public long time1,time2,record,fis,pri,age;
        public int rank;
        public static int number = 0;
        
        static String ch(long t){
            long h=t/3600;
            long m=(t-h*3600)/60;
            long s=t-h*3600-m*60;
            return String.format("%02d:%02d:%02d", h,m,s);
        }
        
        
        static long uutien(long age){
            if(age < 18) return 0;
            if(age < 25) return 1;
            if(age < 32) return 2;
            return 3;
        }
        public Player(String name, String birth, String start, String end){
            number+=1;
            this.id=String.format("VDV%02d", number);
            this.name = name;
            this.birth = birth;
            this.start = start;
            this.end = end;
            SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
            try{
                time1 = f.parse(start).getTime();
                time2 = f.parse(end).getTime();
                this.record=(time2-time1)/1000;
            }catch(ParseException e){
                
            }
           
            this.age=2021-Long.parseLong(birth.split("/")[2]);
            this.pri=uutien(this.age);
            this.fis=this.record-this.pri;
        }
        public String toString(){
            return this.id+" "+this.name+" "+ch(record)+" "+ch(pri)+" "+ch(fis)+" "+this.rank;
        }

        @Override
        public int compareTo(Player o) {
            return (int)(this.fis-o.fis);
        }
    }
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Player> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            Player x = new Player(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr);
        int cnt=1,ok=1;
        for(int i=0;i<arr.size();i++){
            arr.get(i).rank=cnt;
            System.out.println(arr.get(i));
            if(i==arr.size()-1) break;
            if(arr.get(i).fis!=arr.get(i+1).fis){
                cnt+=ok;
                ok=1;
            }else{
                ok++;
            }
        }
    }
}

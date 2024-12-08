/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07084 {
    static class Status implements Comparable<Status>{
        public String name,timein,timeout;
        public long time1,time2,totaltime;
        
        public Status(String name, String timein, String timeout) {
            this.name = name;
            this.timein = timein;
            this.timeout = timeout;
            SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
            try{
                this.time1 = f.parse(this.timein).getTime();
                this.time2 = f.parse(this.timeout).getTime();
                this.totaltime=this.time2-this.time1;
            }catch(ParseException e){
                
            }
        }

        @Override
        public int compareTo(Status o) {
            if(this.totaltime==o.totaltime){
                return this.name.compareTo(o.name);
            }else{
                if(this.totaltime<o.totaltime){
                    return 1;
                }else{
                    return -1;
                }
            }
        }
        public String toString(){
            return this.name+" "+this.totaltime/60000;
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = sc.nextInt();
        ArrayList<Status> arr = new ArrayList<>();
        sc.nextLine();
        while(t-->0){
            arr.add(new Status(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(Status x:arr){
            System.out.println(x);
        }
    }
}

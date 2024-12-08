/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.io.File;
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
public class J07059 {
    static class Exam implements Comparable<Exam>{
        public String id,day,time,room;
        public long totaltime;
        public static int number = 0;
        
        public Exam(String day, String time, String room) {
            this.number +=1;
            this.id=String.format("C%03d", this.number);
            this.day = day;
            this.time = time;
            this.room = room;
            SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy hh:mm");
            try{
                this.totaltime = f.parse(day+" "+time).getTime();
            }catch(ParseException e){
                
            }
        }

        @Override
        public int compareTo(Exam o) {
            if(o.totaltime == this.totaltime){
                return this.id.compareTo(o.id);
            }else{
                return (int)(this.totaltime-o.totaltime);
            }
        }
        
        public String toString(){
            return this.id+" "+this.day+" "+this.time+" "+this.room;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        ArrayList<Exam> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            arr.add(new Exam(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(Exam x:arr){
            System.out.println(x);
        }
    }
}

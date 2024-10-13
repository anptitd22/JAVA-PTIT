/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07054 {
    static class Student{
        public String id,name;
        public double d1,d2,d3;
        public int ranking;
        public double score;
        public static int number = 0;

        public Student(String name, double d1, double d2, double d3) {
            this.number+=1;
            this.id="SV"+String.format("%02d", this.number);
            String []b = name.split("\\s+");
            String res="";
            for(String x:b){
                res+=Character.toUpperCase(x.charAt(0));
                for(int j=1;j<x.length();j++){
                    res+=Character.toLowerCase(x.charAt(j));
                }
                res+=" ";
            }
            this.name = res.trim();
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
            this.score=(d1*3+d2*3+d3*2)/8;
        }
        
        @Override
        public String toString(){
            return this.id+" "+this.name+" "+String.format("%.2f", this.score)+" "+this.ranking;
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<Student> arr = new ArrayList<>();
        int t=sc.nextInt();
        while(t-->0){
            sc.nextLine();
            arr.add(new Student(sc.nextLine().trim(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student o1,Student o2){
                if(o1.score!=o2.score){
                    if(o1.score<o2.score){
                        return 1;
                    }else{
                        return -1;
                    }
                }else{
                    o2.ranking=o1.ranking=-1;
                    return o1.id.compareTo(o2.id);
                }
            }
        });
        int cnt=1;
        int a=cnt;
        for(Student x: arr){
            if(x.ranking==-1){
                x.ranking=a;
                System.out.println(x);
                cnt++;
                continue;
            }else{
                x.ranking=cnt;
                System.out.println(x);
                a=cnt;
                cnt++;
            }
        }
    }
}

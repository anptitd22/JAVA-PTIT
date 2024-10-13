/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07053 {
    static class Candidate{
        public String id,name,birth,status;
        public double d1,d2,score;
        public int age;
        public static int number=0;

        public Candidate(String name, String birth, double d1, double d2) {
            this.number+=1;
            this.id="PH"+String.format("%02d", this.number);
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
            this.birth = birth;
            this.d1 = d1;
            this.d2 = d2;
            this.score=(d1+d2)/2;
            this.age=2021-Integer.parseInt(birth.substring(birth.length()-4));
            if(d1>=8&&d2>=8){
                this.score=Math.min(this.score+1,10);
            }else if(d1>=7.5&&d2>=7.5){
                this.score=Math.min(this.score+0.5,10);
            }
            if(this.score-(int)(this.score)>=0.5){
                this.score=Math.ceil(this.score);
            }else{
                this.score=Math.floor(this.score);
            }
            if(this.score>=9){
                this.status="Xuat sac";
            }else if(this.score>=8){
                this.status="Gioi";
            }else if(this.score>=7){
                this.status="Kha";
            }else if(this.score>=5){
                this.status="Trung binh";
            }else{
                this.status="Truot";
            }
        }
        
        public String toString(){
            return this.id+" "+this.name+" "+this.age+" "+String.format("%.0f", this.score)+" "+this.status;
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t=sc.nextInt();
        ArrayList<Candidate> arr = new ArrayList<>();
        while(t-->0){
            sc.nextLine();
            arr.add(new Candidate(sc.nextLine().trim(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        for(Candidate x:arr){
            System.out.println(x);
        }
    }
}

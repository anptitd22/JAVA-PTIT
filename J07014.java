/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class J07014 {
    static class WordSet{
        public TreeSet<String> set;        
        
        public WordSet(){
            set = new TreeSet<>();
        }
        public WordSet(String f) throws IOException{
            File file = new File(f);
            Scanner sc = new Scanner(file);
            set = new TreeSet<>();
            while(sc.hasNext()){
                set.add(sc.next().toLowerCase());
            }
        }
        
        public WordSet union(WordSet o){
            WordSet s = new WordSet();
            for(String x:o.set){
                s.set.add(x);
            }
            for(String x:this.set){
                s.set.add(x);
            }
            return s;
        }
        
        public WordSet intersection(WordSet o){
            WordSet s = new WordSet();
            for(String x:o.set){
                if(this.set.contains(x)){
                    s.set.add(x);
                }
            }
            return s;
        }
        
        public String toString(){
            String res="";
            for(String x:this.set){
                res+=x+" ";
            }
            res=res.trim();
            return res;
        }
    }
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

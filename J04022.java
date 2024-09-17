/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.*;

/**
 *
 * @author ADMIN
 */
class WordSet{
    TreeSet<String>a;
    
    public WordSet(){
        this.a=new TreeSet<>();
    }
    public WordSet(String b) {
        b=b.toLowerCase();
        a=new TreeSet<>();
        String []arr=b.split("\\s+");
        for(String i:arr)
            this.a.add(i);
    }
    
    public WordSet union(WordSet b){
        WordSet c=new WordSet();
        for(String s:this.a){
            c.a.add(s);
        }
        for(String s:b.a){
            c.a.add(s);
        }
        return c;
    }
    public WordSet intersection(WordSet b){
        WordSet c=new WordSet();
        for(String s:b.a){
            if (this.a.contains(s)==true){
                c.a.add(s);
            }
        }
        return c;
    }

    @Override
    public String toString() {
        String r="";
        for(String s:this.a){
            r+=s+" ";
        }
        return r.trim();
    }
    
}
public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

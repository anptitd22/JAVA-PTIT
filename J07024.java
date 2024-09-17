/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;
import java.io.*;
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
    public WordSet(String file){
        a=new TreeSet<>();
        try{
            Scanner sc = new Scanner(new File(file));
            while(sc.hasNext()){
                this.a.add(sc.next().toLowerCase());
            }
        }catch(FileNotFoundException e){
            
        }
    }
    
    public WordSet difference(WordSet b){
        WordSet c=new WordSet();
        for(String s:this.a){
            if (b.a.contains(s)==false){
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
public class J07024 {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.txt");
        WordSet s2 = new WordSet("DATA2.txt");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}

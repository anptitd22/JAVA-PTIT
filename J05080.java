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
class className{
    public String code,subject,number,lecturer;

    public className(String code, String subject, String number, String lecturer) {
        this.code = code;
        this.subject = subject;
        this.number = number;
        this.lecturer = lecturer;
    }
    
    @Override
    public String toString(){
        return this.code+' '+this.subject+' '+this.number;
    }
}
public class J05080 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        LinkedList<className>arr = new LinkedList<>();
        while(n-->0){
            arr.add(new className(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr,new Comparator<className>(){
            @Override
            public int compare(className o1,className o2){
                if(!o1.code.equals(o2.code)){
                    return o1.code.compareTo(o2.code);
                }else{
                    return Integer.parseInt(o1.number)-Integer.parseInt(o2.number);
                }
            }
        });
        int k=sc.nextInt();
        sc.nextLine();
        while(k-->0){
            String s= sc.nextLine();
            System.out.println("Danh sach cho giang vien "+s+":");
            for(className x:arr){
                if(x.lecturer.equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}

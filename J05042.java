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
class rankings{
    public String name;
    public int correct,submit;

    public rankings(String name, int correct, int submit) {
        this.name = name;
        this.correct = correct;
        this.submit = submit;
    }
    @Override
    public String toString(){
        return this.name+" "+this.correct+" "+this.submit;
    }
}
public class J05042 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<rankings> arr = new LinkedList<>();
        while(n-->0){
            sc.nextLine();
            rankings a = new rankings(sc.nextLine(), sc.nextInt(), sc.nextInt());
            arr.add(a);
        }
        Collections.sort(arr,new Comparator<rankings>(){
            @Override
            public int compare(rankings o1,rankings o2){
                if(o1.correct!=o2.correct){
                    return o2.correct-o1.correct;
                }else{
                    if(o1.submit!=o2.submit){
                        return o1.submit-o2.submit;
                    }else{
                        return o1.name.compareTo(o2.name);
                    }
                }
            }
        });
        for(rankings x: arr){
            System.out.println(x);
        }
    }
}

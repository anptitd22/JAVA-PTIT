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
public class J05032 {
    static class People{
        public String name,birth,d,m,y;

        public People(String name, String birth) {
            this.name = name;
            this.birth = birth;
            String [] a = birth.split("/");
            d=a[0];
            m=a[1];
            y=a[2];
        }
        
        public String toString(){
            return this.name;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<People> arr = new ArrayList<>();
        int t= sc.nextInt();
        int n=t;
        while(t-->0){
            arr.add(new People(sc.next(), sc.next()));
        }
        Collections.sort(arr, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                if(o1.y.equals(o2.y)){
                    if(o1.m.equals(o2.m)){
                        return o1.d.compareTo(o2.d);
                    }else{
                        return o1.m.compareTo(o2.m);
                    }
                }else{
                    return o1.y.compareTo(o2.y);
                }
            }
        });
        System.out.println(arr.get(n-1));
        System.out.println(arr.get(0));
    }
}

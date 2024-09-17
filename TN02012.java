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

public class TN02012 {
    public static HashMap<String,String>map=new HashMap<>();
    public static int [][] arr={{10,12,14,20},{10,11,13,16},{9,10,12,14},{8,9,11,13}};
    static class Staff{
        public String id,name,team;
        public long number,day,unit_salary,salary;

        public Staff(String id, String name, long day, long unit_salary) {
            this.id = id;
            this.name = name;
            this.day = day;
            this.unit_salary = unit_salary;
            this.team=map.get(id.substring(3,5));
            int res=Integer.parseInt(id.substring(1,3));
            if (res<=3){
                this.number=arr[id.charAt(0)-'A'][0];
                this.salary=this.day*this.unit_salary*this.number*1000;
            }else if(res<=8){
                this.number=arr[id.charAt(0)-'A'][1];
                this.salary=this.day*this.unit_salary*this.number*1000;
            }else if(res<=15){
                this.number=arr[id.charAt(0)-'A'][2];
                this.salary=this.day*this.unit_salary*this.number*1000;
            }else{
                this.number=arr[id.charAt(0)-'A'][3];
                this.salary=this.day*this.unit_salary*this.number*1000;
            }
        }
        @Override
        public String toString(){
            return this.id+' '+this.name+' '+this.team+' '+this.salary;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String [] a= sc.nextLine().split("\\s+");
            String res="";
            for(int i=1;i<a.length;i++){
                res+=a[i]+' ';
            }
            res=res.trim();
            map.put(a[0], res);
        }
        t=sc.nextInt();
        while(t-->0){
            sc.nextLine();
            Staff s=new Staff(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            System.out.println(s);
        }
    }
}

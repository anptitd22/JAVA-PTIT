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
class Staff{
    public String id,name,gender,birth,adress,code,date;
    public static int number = 0;

    public Staff(String name, String gender, String birth, String adress, String code, String date) {
        this.number+=1;
        this.id = String.format("%05d",this.number);
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.adress = adress;
        this.code = code;
        this.date = date;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.gender+" "+this.birth+" "+this.adress+" "+this.code+" "+this.date;
    }
}
public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Staff> arr= new LinkedList<>();
        sc.nextLine();
        while(n-->0){
            Staff a = new Staff(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(a);
        }
        for(Staff x:arr){
            System.out.println(x);
        }
    }
}

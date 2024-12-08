/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J05028 {
    static class DoanhNghiep implements Comparable<DoanhNghiep>{
        public String id,name;
        public long number;

        public DoanhNghiep(String id, String name, long number) {
            this.id = id;
            this.name = name;
            this.number = number;
        }

        @Override
        public int compareTo(DoanhNghiep o) {
            if(this.number == o.number){
                return this.id.compareTo(o.id);
            }else{
                return (int)(o.number-this.number);
            }
        }
        public String toString(){
            return this.id+" "+this.name+" "+this.number;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        int t= sc.nextInt();
        while(t-->0){
            sc.nextLine();
            arr.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextLong()));
        }
        Collections.sort(arr);
        for(DoanhNghiep x : arr){
            System.out.println(x);
        }
    }
}

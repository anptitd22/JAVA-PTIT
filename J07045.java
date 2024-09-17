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
public class J07045 {
    static class LoaiPhong implements Comparable<LoaiPhong>{
        public String id,name;
        public int until_price;
        public float service;

        public LoaiPhong(String input) {
            String [] a = input.trim().split("\\s+");
            this.id = a[0];
            this.name = a[1];
            this.until_price = Integer.parseInt(a[2]);
            this.service = Float.parseFloat(a[3]);
        }
        
        @Override
        public int compareTo(LoaiPhong o){
            return this.name.compareTo(o.name);
        }        
        @Override
        public String toString(){
            return this.id+" "+this.name+" "+this.until_price+" "+this.service;
        }
    }
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}

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
class Product implements Comparable<Product>{
    public String id,name;
    public long price,guarantee;

    public Product(String id, String name, long price, long guarantee) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.guarantee = guarantee;
    }

    @Override
    public int compareTo(Product o1){
        if(o1.price!=this.price){
            return (int)(o1.price-this.price);
        }else{
            return this.id.compareTo(o1.id);
        }
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.price+" "+this.guarantee;
    }
}
public class J07048{
    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("SANPHAM.in"));
        int t = sc.nextInt();
        ArrayList<Product> arr = new ArrayList<>();
        while(t-->0){
            sc.nextLine();
            arr.add(new Product(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr);
        for(Product x: arr){
            System.out.println(x);
        }
    }
}

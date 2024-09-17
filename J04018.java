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
class soPhuc{
    public int rl,ig;

    public soPhuc() {
    }

    public soPhuc(int rl, int ig) {
        this.rl = rl;
        this.ig = ig;
    }
    
    public soPhuc nhan(soPhuc b){
        soPhuc r=new soPhuc();
        r.rl=this.rl*b.rl-this.ig*b.ig;
        r.ig=this.rl*b.ig+this.ig*b.rl;
        return r;
    }
    
    public soPhuc cong(soPhuc b){
        soPhuc r=new soPhuc();
        r.rl=this.rl+b.rl;
        r.ig=this.ig+b.ig;
        return r;
    }
    
    public String toString(){
        return this.rl+" + "+this.ig+"i";
    }
}
public class J04018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            soPhuc a=new soPhuc(sc.nextInt(),sc.nextInt());
            soPhuc b=new soPhuc(sc.nextInt(),sc.nextInt());
            soPhuc c=new soPhuc();
            soPhuc d=new soPhuc();
            soPhuc e=new soPhuc();
            c=a.cong(b);
            d=a.nhan(c);
            e=c.nhan(c);
            System.out.println(d+", "+e);
        }
    }
}

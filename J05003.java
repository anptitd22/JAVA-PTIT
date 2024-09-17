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
class SinhVien{
    public String id,name,nameClass,birth;
    public float gpa;
    public static int number=0;

    public SinhVien(String name, String nameClass, String birth, float gpa) {
        this.number+=1;
        this.id = "B20DCCN"+String.format("%03d",this.number);
        this.name = name;
        this.nameClass = nameClass;
        this.birth = birth;
        this.gpa = gpa;
    }
    public void chuanhoa(){
        StringBuilder sb= new StringBuilder(this.birth);
        if(sb.charAt(1)=='/'){
            sb.insert(0, "0");
        }
        if(sb.charAt(4)=='/'){
            sb.insert(3, "0");
        }
        this.birth=sb.toString();
    }
    @Override
    public String toString(){
        chuanhoa();
        return this.id +" "+this.name+" "+this.nameClass+" "+this.birth+" "+String.format("%.2f",this.gpa);
    }
}
public class J05003 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<SinhVien> arr = new LinkedList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            SinhVien a = new SinhVien(sc.nextLine(),sc.next(), sc.next(), sc.nextFloat());
            arr.add(a);
        }
        for(SinhVien x:arr){
            System.out.println(x);
        }
    }
}

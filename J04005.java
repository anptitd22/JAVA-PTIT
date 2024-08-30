package JAVA.CODEPTITJV;

import java.util.Scanner;

// class ThiSinh{
//     public String name,birth;
//     public double d1,d2,d3;

//     public ThiSinh(String name, String birth, double d1, double d2, double d3) {
//         this.name = name;
//         this.birth = birth;
//         this.d1 = d1;
//         this.d2 = d2;
//         this.d3 = d3;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getBirth() {
//         return birth;
//     }

//     public void setBirth(String birth) {
//         this.birth = birth;
//     }

//     public double getD1() {
//         return d1;
//     }

//     public void setD1(double d1) {
//         this.d1 = d1;
//     }

//     public double getD2() {
//         return d2;
//     }

//     public void setD2(double d2) {
//         this.d2 = d2;
//     }

//     public double getD3() {
//         return d3;
//     }

//     public void setD3(double d3) {
//         this.d3 = d3;
//     }
    
//     public String chuanhoa(){
//         StringBuilder sb=new StringBuilder(this.birth);
//         if(sb.charAt(1)=='/') sb.insert(0, "0");
//         if(sb.charAt(4)=='/') sb.insert(3, "0");
//         return sb.toString();
//     }
//     public String toString(){
//         chuanhoa();
//         return this.name+" "+this.birth+" "+String.format("%.1f", this.d1+this.d2+this.d3);
//     }

// }
public class J04005 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ThiSinh x= new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(x);
    }
}

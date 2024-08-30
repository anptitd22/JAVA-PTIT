package JAVA.CODEPTITJV;

import java.util.Scanner;

// class phanSo1{
//     private long a,b;

//     public long gcd(long a,long b){
//         if(b==0) return a;
//         return gcd(b,a%b);
//     }
//     public long lcm(long a,long b){
//         return a*b/gcd(a,b);
//     }

//     public phanSo1() {
//         this.a=0;
//         this.b=1;
//     }
    
//     public phanSo1(long a, long b) {
//         this.a = a;
//         this.b = b;
//     }
//     public long getA() {
//         return a;
//     }
//     public void setA(long a) {
//         this.a = a;
//     }
//     public long getB() {
//         return b;
//     }
//     public void setB(long b) {
//         this.b = b;
//     }
    
//     public phanSo1 cong(phanSo1 p){
//         phanSo1 s=new phanSo1();
//         long x=lcm(this.b,p.b);
//         s.a=this.a*(x/this.b)+p.a*(x/p.b);
//         long y=gcd(s.a,x);
//         s.a/=y;
//         s.b=x/y;
//         return s;
//     }
//     public String toString(){
//         return this.a+"/"+this.b;
//     }
// }
public class J04004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        phanSo1 a=new phanSo1(sc.nextLong(), sc.nextLong());
        phanSo1 b=new phanSo1(sc.nextLong(), sc.nextLong());
        phanSo1 c=new phanSo1();
        c=a.cong(b);
        System.out.println(c);
    }
}

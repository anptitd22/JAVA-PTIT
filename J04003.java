package JAVA.CODEPTITJV;
import java.util.*;
// class phanSo{
//     private long a,b;

//     public long gcd(long a,long b){
//         if (b==0) return a;
//         return gcd(b,a%b);
//     }

//     public phanSo(long a, long b) {
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

//     public String toString(){
//         long x=gcd(this.a,this.b);
//         return String.format("%d/%d",this.a/x,this.b/x );
//     }
// }
public class J04003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        phanSo x=new phanSo(sc.nextLong(),sc.nextLong());
        System.out.println(x);
    }
}

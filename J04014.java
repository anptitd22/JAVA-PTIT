// package JAVA.CODEPTITJV;

// import java.util.Scanner;

// class phanSo{
//     public long a,b;

//     public phanSo(long a, long b) {
//         this.a = a;
//         this.b = b;
//     }

//     public long gcd(long a,long b){
//         if(b==0) return a;
//         return gcd(b,a%b);
//     }

//     public long lcm(long a,long b){
//         return a*b/gcd(a,b);
//     }

//     public phanSo C(phanSo b){
//         phanSo c=new phanSo(0,1);
//         long x=lcm(this.b,b.b);
//         c.b=(long)Math.pow(x,2);
//         c.a=(long)Math.pow((this.a*(x/this.b)+b.a*(x/b.b)),2);
//         long y=gcd(c.a,c.b);
//         c.a/=y;
//         c.b/=y;
//         return c;
//     }

//     public phanSo nhan(phanSo a){
//         phanSo c= new phanSo(0,1);
//         c.a=this.a*a.a;
//         c.b=this.b*a.b;
//         long x=gcd(c.a,c.b);
//         c.a/=x;
//         c.b/=x;
//         return c;
//     }
//     public String toString(){
//         if (this.b<0){
//             this.b=Math.abs(this.b);
//             return "-"+this.a+"/"+this.b;
//         }else{
//            return this.a+"/"+this.b; 
//         }
//     }
// }
// public class J04014 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t-->0){
//             phanSo x=new phanSo(sc.nextLong(),sc.nextLong());
//             phanSo y=new phanSo(sc.nextLong(), sc.nextLong());
//             phanSo c=new phanSo(0, 1);
//             phanSo c1=new phanSo(0, 1);
//             phanSo d=new phanSo(0, 1);
//             c=x.C(y);
//             c1=x.nhan(y);
//             d=c1.nhan(c);
//             System.out.println(c+" "+d);
//         }
//     }
// }

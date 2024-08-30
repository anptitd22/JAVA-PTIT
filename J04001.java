package JAVA.CODEPTITJV;

import java.util.Scanner;
// class Point{
//     public double x,y;
//     public Point(){
//         this.x=0;
//         this.y=0;
//     }
//     public Point(double x,double y){
//         this.x=x;
//         this.y=y;
//     }
//     public Point Point(Point p){
//         p.x=this.x;
//         p.y=this.y;
//         return p;
//     }
//     public double getX(){
//             return this.x;
//     }
//     public double getY(){
//             return this.y;
//     }
//     public double distance(Point p){
//         return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
//     }
//     public double distance(Point p,Point p2){
//         return Math.sqrt(Math.pow(p.x-p2.x,2)+Math.pow(p.y-p2.y,2));
//     }
//     public String toString(){
//         return x+" "+y;
//     }
// }
public class J04001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Point x1=new Point(sc.nextDouble(), sc.nextDouble());
            Point x2=new Point(sc.nextDouble(),sc.nextDouble());
            System.out.printf("%.4f\n",x1.distance(x2));
        }
    }
}

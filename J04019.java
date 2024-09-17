/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

/**
 *
 * @author ADMIN
 */
import java.util.*;
class Point{
    public float x,y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint(Scanner scanner){
        return new Point(scanner.nextFloat(),scanner.nextFloat());
    }
    public double Line(Point b){
        return Math.sqrt(Math.pow(this.x-b.x, 2)+Math.pow(this.y-b.y, 2));
    }
}
class Triangle{
    public Point x1,x2,x3;

    public Triangle(Point x1, Point x2, Point x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }
    
    public boolean valid(){
        double a=this.x1.Line(x3);
        double b=this.x2.Line(x3);
        double c=this.x2.Line(x1);
        if(a+c>b && a+b>c && c+b>a){
            return true;
        }else{
            return false;
        }
    }
    public String getPerimeter(){
        return String.format("%.3f",this.x1.Line(x2)+this.x2.Line(x3)+this.x3.Line(x1));
    }
}
public class J04019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}

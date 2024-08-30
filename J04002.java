package JAVA.CODEPTITJV;
import java.util.*;
// class Rectange{
//     public double width,height;
//     public String color;
//     public Rectange(){
//         this.width=1;
//         this.height=1;
//     }
//     public Rectange(double width, double height, String color) {
//         this.width = width;
//         this.height = height;
//         this.color = color;
//     }
//     public double getWidth() {
//         return width;
//     }
//     public void setWidth(double width) {
//         this.width = width;
//     }
//     public double getHeight() {
//         return height;
//     }
//     public void setHeight(double height) {
//         this.height = height;
//     }
//     public String getColor() {
//         String res="";
//         res+=Character.toUpperCase(this.color.charAt(0));
//         for(int j=1;j<this.color.length();j++){
//             res+=Character.toLowerCase(this.color.charAt(j));
//         }
//         return res;
//     }
//     public void setColor(String color) {
//         this.color = color;
//     }
//     public double findArea(){
//         return this.width*this.height;
//     }
//     public double findPerimeter(){
//         return (this.height+this.width)*2;
//     }
//     public String toString(){
//         if (this.height<=0 || this.width<=0){
//             return "INVALID";
//         }else
//             return String.format("%d %d %s",(int)this.findPerimeter(),(int)this.findArea(),this.getColor());
//     }
// }
public class J04002 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectange x=new Rectange(sc.nextInt(), sc.nextInt(), sc.next());
        System.out.println(x);
    }
}

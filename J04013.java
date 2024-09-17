// package JAVA.CODEPTITJV;

// import java.util.Scanner;
//  class Student{
//     public String id,name;
//     public double d1,d2,d3;

//     public Student(String id, String name, double d1, double d2, double d3) {
//         this.id = id;
//         this.name = name;
//         this.d1 = d1;
//         this.d2 = d2;
//         this.d3 = d3;
//     }
    
//     public String diemvung(){
//         String res=this.id.substring(0,3);
//         if(res.compareTo("KV1")==0){
//             return "0.5";
//         }else if(res.compareTo("KV2")==0){
//             return "1";
//         }else{
//             return "2.5";
//         }
//     }

//     public String diemchuan(){
//         double res=((double)(this.d1*2+this.d2+this.d3))+Double.parseDouble(this.diemvung());
//         if(res==(int)res){
//             return String.format("%.0f", res);
//         }else{
//             return String.format("%.1f",res);
//         }
//     }

//     public String dat(){
//         if(Double.parseDouble(this.diemchuan())>=24){
//             return "TRUNG TUYEN";
//         }else{
//             return "TRUOT";
//         }
//     }
//     public String diem(){
//         double res=this.d1*2+this.d2+this.d3;
//         if(res==(int)res){
//             return String.format("%.0f", res);
//         }else{
//             return String.format("%.1f", res);
//         }
//     }
//     public String toString(){
//         return this.id+" "+this.name+" "+this.diemvung()+" "+this.diem()+" "+this.dat();
//     }
//  }
// public class J04013 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         Student x= new Student(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
//         System.out.println(x);
//     }
// }

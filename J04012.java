// package JAVA.CODEPTITJV;

// import java.util.Scanner;

// class Employer{
//     public String id,name,cv;
//     public int salary,date;
//     public static int soLuong = 0;

//     public Employer(String name,int salary, int date, String cv) {
//         this.soLuong+=1;
//         this.id="NV"+String.format("%02d", this.soLuong);
//         this.name = name;
//         this.cv = cv;
//         this.salary = salary;
//         this.date = date;
//     }
    
//     public int phuLuong(){
//         if(this.cv.compareTo("GD")==0){
//             return 250000;
//         }else if(this.cv.compareTo("PGD")==0){
//             return 200000;
//         }else if(this.cv.compareTo("TP")==0){
//             return 180000;
//         }else{
//             return 150000;
//         }
//     }

//     public int luongThuong(){
//         if(this.date>=25){
//             return (this.salary*this.date*2)/10;
//         }else if(this.date>=22 && this.date<25){
//             return this.salary*this.date*1/10;
//         }else{
//             return 0;
//         }
//     }

//     public int luong(){
//         return this.salary*this.date+this.luongThuong()+this.phuLuong();
//     }

//     public String toString(){
//         return this.id+" "+this.name+" "+(this.salary*this.date)+" "+this.luongThuong()+" "+this.phuLuong()+" "+this.luong();
//     }
// }
// public class J04012{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         Employer x= new Employer(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next());
//         System.out.println(x);
//     }
// }
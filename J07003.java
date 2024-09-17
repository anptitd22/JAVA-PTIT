/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class J07003 {
    public static void main(String[] args) {
        File file = new File("DATA.in");
        try{
            Scanner sc= new Scanner(file);
            BigInteger a=sc.nextBigInteger();
            while(a.toString().length()>1){
                int length = a.toString().length();
                BigInteger b = new BigInteger(a.toString().substring(0, length/2));
                BigInteger c = new BigInteger(a.toString().substring(length/2));
                a=b.add(c);
                System.out.println(a);
            }
            sc.close();
        }catch(FileNotFoundException e){
            
        }
    }
}

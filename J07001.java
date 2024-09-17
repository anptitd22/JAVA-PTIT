/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author ADMIN
 */
public class J07001{
    public static void main(String[] args)throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}

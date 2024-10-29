/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test06.test06;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class b1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        HashSet<BigInteger>set= new HashSet<>();
        BigInteger sum= BigInteger.ZERO;
        BigInteger mul= BigInteger.ONE;
        while(sc.hasNext()){
            set.add(sc.nextBigInteger());
        }
        for(BigInteger x:set){
            sum=sum.add(x);
            mul=mul.multiply(x);
        }
        System.out.println(sum);
        System.out.println(mul);
    }
}

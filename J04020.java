/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.*;

/**
 *
 * @author ADMIN
 */
class Pair<k,v>{
    public k key;
    public v value;

    public Pair(k key, v value) {
        this.key = key;
        this.value = value;
    }

    public static <k,v> Pair of (k key,v value){
        return new Pair<>(key,value);
    }
    
    public boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrime() {
        if (checkPrime(Integer.parseInt(key.toString())) && checkPrime(Integer.parseInt(value.toString()))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
}
public class J04020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}

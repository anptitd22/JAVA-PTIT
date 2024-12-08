/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J08029 {
    static class toado{
        public int x,y;

        public toado(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
    }
    public static int dx[] = {-1,-2,-2,-1,1,2,2,1};
    public static int dy[]= {-2,-1,1,2,2,1,-1,-2};
    public static void bfs(toado x, toado y){
        Queue<toado> q = new LinkedList<toado>();
        Queue<Integer> cnt = new LinkedList<Integer>();
        HashSet<toado> set = new HashSet<>();
        q.add(x);
        cnt.add(0);
        while(!q.isEmpty()&&!cnt.isEmpty()){
            toado z = q.peek();
            q.poll();
            int c = cnt.peek();
            cnt.poll();
            if(z.x==y.x&&z.y==y.y){
                System.out.println(c);
                return;
            }
            for(int i=0;i<8;i++){
                int rx=z.x+dx[i];
                int ry=z.y+dy[i];
                toado r = new toado(rx, ry);
                if(rx>=0&&rx<8&&ry>=0&&ry<8&&!set.contains(r)){
                    q.add(r);
                    set.add(r);
                    cnt.add(c+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s1 = sc.next();
            String s2 = sc.next();
            toado x = new toado(s1.charAt(1)-'1', s1.charAt(0)-'a');
            toado y = new toado(s2.charAt(1)-'1', s2.charAt(0)-'a');
            bfs(x,y);
        }
    }
}

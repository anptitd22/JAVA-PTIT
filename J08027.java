package JAVA.CODEPTITJV;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class J08027 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Deque<Character>q=new LinkedList<>();
        Deque<Character>q2=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='<'){
                if(!q.isEmpty()){
                    q2.addFirst(q.peekLast());
                    q.pollLast();
                }
            }else if(s.charAt(i)=='>'){
                if(!q2.isEmpty()){
                    q.addLast(q2.getFirst());
                    q2.pollFirst();
                }
            }else if(s.charAt(i)=='-'){
                if(!q.isEmpty()) q.pollLast();
            }else q.addLast(s.charAt(i));
        }
        while(!q.isEmpty()){
            System.out.print(q.getFirst());
            q.pollFirst();
        }
        while(!q2.isEmpty()){
            System.out.print(q2.getFirst());
            q2.pollFirst();
        }
        System.out.println();
    }
}

package JAVA.CODEPTITJV;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class hv{
    public int x1,x2,x3,x4,x5,x6,cnt;

    public hv(int x1, int x2, int x3, int x4, int x5, int x6) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.x5 = x5;
        this.x6 = x6;
        this.cnt=0;
    }
    
    public boolean compare(hv b){
        if (this.x1==b.x1 && this.x2==b.x2 && this.x3==b.x3 && this.x4==b.x4 && this.x5==b.x5 && this.x6==b.x6){
            return true;
        }else return false;
    }

    public hv xoaytrai(){
        hv x = new hv(this.x4, this.x1, this.x3, this.x5, this.x2, this.x6);
        x.cnt=this.cnt+1;
        return x;
    }
    public hv xoayphai(){
        hv x = new hv(this.x1, this.x5, this.x2, this.x4, this.x6, this.x3);
        x.cnt=this.cnt+1;
        return x;
    }
}
public class J08025 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Queue<hv>q=new LinkedList<hv>();
            HashSet<hv>st=new HashSet<>();
            hv x=new hv(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            hv y=new hv(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            q.add(x);
            st.add(x);
            while(!q.isEmpty()){
                hv a=q.peek();
                q.poll();
                if (y.compare(a)){
                    System.out.println(a.cnt);
                    break;
                }
                if(!st.contains(a.xoayphai())){
                    q.add(a.xoayphai());
                }
                if(!st.contains(a.xoaytrai())){
                    q.add(a.xoaytrai());
                }
            }
        }
    }
}

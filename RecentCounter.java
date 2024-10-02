import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    Queue<Integer> q = new LinkedList<>();
    int cnt;
    public RecentCounter() {
        this.cnt=0;
    }
    
    public int ping(int t) {
        if(q.isEmpty() || t<3000){
            q.add(t);
            return q.size();
        }
        else{
            int range = t-3000;
            int n=q.size();
            while(n>0){
                if(q.peek()<range){
                    q.remove();
                }
                n--;
            }
            q.add(t);
            return q.size();
        }
    }
    public static void main(String[] args) {
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
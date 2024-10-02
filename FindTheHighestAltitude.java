import java.util.Arrays;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        FindTheHighestAltitude fth = new FindTheHighestAltitude();
        System.out.println(fth.largestAltitude(gain));
    }
    public int largestAltitude(int[] gain) {
        int n=gain.length,max=0;
        int[] g1 = new int[n+1];
        max=g1[0]=0;
        for(int i=0;i<n;i++){
            g1[i+1]=gain[i]+g1[i];
            max=Math.max(g1[i], g1[i+1]);
        }
        System.out.println(Arrays.toString(g1));
        return max;
        
    }
}

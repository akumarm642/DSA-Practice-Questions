import java.util.ArrayList;
import java.util.Collections;

public class FindMaxAreaV2 {
    

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        FindMaxAreaV2 fma = new FindMaxAreaV2();
        System.out.println(fma.maxArea1(height));
    }
    public int maxArea1(int[] height) {
        int max=0,n=height.length;
        ArrayList<Integer> h1 = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(height[i]!=0){
            h1.add(height[i]);
            }
        }
        Collections.sort(h1);
        System.out.println(h1);
        
        return max;
        
    }



}

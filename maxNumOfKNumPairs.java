import java.util.ArrayList;
import java.util.Collections;

public class maxNumOfKNumPairs {

    public static void main(String[] args) {
        int[] nums = {3,1,3,4,3};
        int k=6;
        maxNumOfKNumPairs mx = new maxNumOfKNumPairs();
        System.out.println(mx.maxOperations(nums, k));
    }
    public int maxOperations(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=k){
            arr.add(nums[i]);
            }
        }
        Collections.sort(arr);
        int m=0,n=arr.size()-1,count=0,p,q;
        while(m<n){
            p=arr.get(m);
            q=arr.get(n);
            if(p+q==k&&m<n){
                count++;
                arr.remove(n);
                arr.remove(m);
                n=arr.size()-1;
                m=0;
            }else if(p+q>k&&m<n){
                n--;
            }else if(m<n){
                m++;
            }
        }
        return count;
        
    }
}
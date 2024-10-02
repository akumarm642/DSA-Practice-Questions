import java.util.Arrays;

public class maximumAverageSubarray {
    public static void main(String[] args) {
        int[] nums = {0,4,0,3,2};
        double k=1;
        maximumAverageSubarray mas = new maximumAverageSubarray();
        System.out.println(mas.findMaxAverage(nums,k));
    }
    public double findMaxAverage(int[] nums, double k) {
        int n=nums.length;
        double total = Arrays.stream(Arrays.copyOfRange(nums, 0, (int)k)).sum();
        double max =  total/k;
        for(int i=(int)k;i<n;i++){
            if((total+nums[i]-nums[i-(int)k])/k>max){
                total=total+nums[i]-nums[i-(int)k];
                max=total/k;
            }else{
                total=total+nums[i]-nums[i-(int)k];  
            }

        }
        return max;
        
    }
}

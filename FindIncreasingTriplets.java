

public class FindIncreasingTriplets {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,5};
        FindIncreasingTriplets fit = new FindIncreasingTriplets();
        System.out.println(fit.increasingTriplet(nums));
        
    }
    public boolean increasingTriplet(int[] nums) {
        int j=0,k=0,n=nums.length;
        for(j=0;j<n-2;j++){
        for(int i=j+1;i<n-1;i++){
            if(nums[j]<nums[i]){
                System.out.println(nums[i]);
                for( k=i+1;k<n;k++){
                    if(nums[i]<nums[k]){
                        return true;
                    }else{continue;}
                }
        
            }else{continue;}

        }
    }

        
        return false;
    }
}

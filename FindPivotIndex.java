
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        FindPivotIndex fpi = new FindPivotIndex();
        System.out.println(fpi.pivotIndex(nums));
    }
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] leftsum = new int[n];
        int[] rightsum = new int[n];
        leftsum[0]=0;
        for(int i=1;i<n;i++){
            leftsum[i] = leftsum[i-1]+nums[i-1];
        }
        rightsum[n-1]=0;
        for(int i=n-2;i>=0;i--){
            rightsum[i] = rightsum[i+1]+nums[i+1];
        }

        for(int i=0;i<n;i++){
            if(leftsum[i]==rightsum[i]){
                return i;
            }
            
        }

        return -1;
        
    }
}

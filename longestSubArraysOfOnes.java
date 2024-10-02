

public class longestSubArraysOfOnes {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};
        longestSubArraysOfOnes ls1 = new longestSubArraysOfOnes();
        System.out.println(ls1.longestSubarray(nums));
    }

    public int longestSubarray(int[] nums) {
        int l = 0, r = 0, n = nums.length, len = 0, count = 0, max = 0;
        if (n == 0) {
            return 0;
        }
        for (; r < n; r++) {
            if (nums[r] == 0) {
                count++;
            }

            while(count>1){
                if(nums[l]==0){
                    count--;
                    
                }
                l++;
            }
            if (count < 2) {
                len = r - l;
                max = Math.max(max, len);
            }

            
        }

        return max;

    }
}

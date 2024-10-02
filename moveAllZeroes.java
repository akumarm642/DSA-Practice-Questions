
public class moveAllZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 2 };
        moveAllZeroes maz = new moveAllZeroes();
        maz.moveZeroes(nums);
    }

    private void moveZeroes(int[] nums) {
        int j = nums.length-1, i = 0;
        while (i < j) {
            while (i < j && nums[i] != 0) {
                i++;
            }
            for (int k = i; k < j&&i<j; k++) {
                nums[k] = nums[k + 1];

            }
            if(i<j){
            nums[j] = 0;
            j--;
            }
        }
    }
}

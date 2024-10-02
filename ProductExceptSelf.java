import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ProductExceptSelf pes = new ProductExceptSelf();
        System.out.println(Arrays.toString(pes.productExceptSelf(nums)));
        
    }
    private int[] productExceptSelf(int[] nums) {
        //This program is specifically to achieve o(n)
        int i=0,n=nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] both = new int[n];
        left[0]=1;
        for(i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        right[n-1]=1;
        for(i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        for(i=0;i<n;i++){
            both[i]=left[i]*right[i];
        }
        return both;

        
        
}
}

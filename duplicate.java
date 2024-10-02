import java.util.HashSet;

public class duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        duplicate dp = new duplicate();
        System.out.println(dp.containsDuplicate(nums));
    }
    private boolean containsDuplicate(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        for(int n : nums){
            arr.add(n);
        }
        for(int n : nums){
            if(arr.contains(n)){
                arr.remove(n);
            }else{
                return false;
            }
        }
        return true;
        
        
    }
}

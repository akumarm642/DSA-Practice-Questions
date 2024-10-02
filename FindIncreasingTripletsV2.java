public class FindIncreasingTripletsV2 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,5};
        FindIncreasingTripletsV2 ft = new FindIncreasingTripletsV2();
        System.out.println(ft.increasingTriplet1(nums));
        
    }
    private boolean increasingTriplet1( int[] nums){
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        for (int num : nums){
            if(num<=a){
                a=num;
            }else if(num<=b){
                b=num;
            }else{
                return true;
            }
        }
        return false;

    }
}

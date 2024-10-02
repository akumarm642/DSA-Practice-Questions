import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,1,5,3};
        int extraCandies = 3;
        KidsWithGreatestNumberOfCandies s1 = new KidsWithGreatestNumberOfCandies();
        List<Boolean> result = s1.kidsWithCandies(candies, extraCandies);        
        System.out.println(result);
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max=candies[0];
        for(int i : candies){
            if(i>max){
                max=i;
            }
        }
        List<Boolean> result = new ArrayList<Boolean>(n);
        for(int j=0;j<candies.length;j++){
            if(candies[j]+3>=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}

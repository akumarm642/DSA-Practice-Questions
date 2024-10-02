import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        int[][] grid = { { 3, 1, 2, 2 }, { 1, 4, 4, 5 }, { 2, 4, 2, 2 }, { 2, 4, 2, 2 } };
        EqualRowAndColumnPairs eq = new EqualRowAndColumnPairs();
        System.out.println(eq.equalPairs(grid));
    }

    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> htr = new HashMap<>();
        HashMap<String, Integer> htc = new HashMap<>();
        int cnt=0;
        for (int[] nums : grid) {
            StringBuilder sb1 = new StringBuilder();
            for (int n1 : nums) {
                sb1.append(n1).append('#');
            }
            htr.put(sb1.toString(), htr.getOrDefault(sb1.toString(), 0) + 1);
        }
        for (int j = 0; j < grid[0].length; j++) {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < grid.length; i++) {
                sb2.append(grid[i][j]).append('#');
            }
            htc.put(sb2.toString(), htc.getOrDefault(sb2.toString(), 0) + 1);
        }
        for(Map.Entry<String,Integer> e : htr.entrySet()){
            String key = e.getKey();
            if(htc.containsKey(key)){
                cnt += htr.get(key)*htc.get(key);
            }
        }
        return cnt;
    }
}

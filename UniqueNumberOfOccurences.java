import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurences {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 2, 1, 1, 3 };
        UniqueNumberOfOccurences un = new UniqueNumberOfOccurences();
        System.out.println(un.uniqueOccurrences(nums));
    }

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int element : arr) {
            if (hm.containsKey(element)) {
                hm.put(element, hm.get(element) + 1);
            } else {
                hm.put(element, 1);
            }
        }
        HashSet<Integer> hs = new HashSet<>(hm.values());
        if(hs.size()==hm.size())
            return true;
        return false;

    }
}

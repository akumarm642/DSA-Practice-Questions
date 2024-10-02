import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindTheDifferenceOf2Arrays {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 3 };
        int[] nums2 = { 1, 1, 2, 2 };
        FindTheDifferenceOf2Arrays ftd = new FindTheDifferenceOf2Arrays();
        System.out.println(ftd.findDifference(nums1, nums2));
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        HashSet<Integer> n1 = new HashSet<>(Arrays.asList(Arrays.stream(nums1).boxed().toArray(Integer[]::new)));
        HashSet<Integer> n2 = new HashSet<>(Arrays.asList(Arrays.stream(nums2).boxed().toArray(Integer[]::new)));

        for (int i = 0; i < nums2.length; i++) {
            if (n1.contains(nums2[i])) {
                n1.remove(nums2[i]);
                n2.remove(nums2[i]);
            }
        }
        List<Integer> list11 = new ArrayList<>(n1);
        List<Integer> list22 = new ArrayList<>(n2);
        answer.add(list11);
        answer.add(list22);
        return answer;

    }
}

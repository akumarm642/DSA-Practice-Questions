public class maxConsecutivesOnes {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0,
                1, 0, 0, 1, 1, 0, 1, 1 };
        int k = 8;
        maxConsecutivesOnes mco = new maxConsecutivesOnes();
        System.out.println(mco.longestOnes(nums, k));
    }

    private int longestOnes(int[] nums, int k) {
        int count = 0, n = 0, max = 0, k1;
        if (k == 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    count++;
                    max = Math.max(max, count);
                } else {
                    count = 0;
                }

            }
            return max;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
            if (count == k && (i == nums.length - 1 || nums[i + 1] == 0)) {
                n = i + 1;
                break;
            }
        }
        if (count < k) {
            return nums.length;
        }
        max = n;
        k1 = max;

        for (int i = 1; i < nums.length; i++) {
            if (isOne(nums[i - 1]) == 0) {
                count--;
            }
            if (count < k) {
                for (int j = k1; j < nums.length; j++) {
                    if (nums[j] == 0) {
                        count++;
                    }
                    if (j < nums.length - 1) {
                        if (count == k && nums[j + 1] == 0) {
                            k1 = j + 1;
                            n = j + 1 - i;
                            break;
                        }
                    } else {
                        if (nums[j] == 1) {
                            k1 = j + 1;
                            n = j + 1 - i;
                        }

                    }
                }
            }
            max = Math.max(max, n);
        }
        return max;

    }

    public static int isOne(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}

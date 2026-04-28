package arrays;

import java.util.Arrays;

public class MaximumSumWithExactlyKElements_2656 {
    public int maximizeSum(int[] nums, int k) {
        int max = Arrays.stream(nums)
                .max().getAsInt();
        return (2 * max + k - 1) * k / 2;
    }
}

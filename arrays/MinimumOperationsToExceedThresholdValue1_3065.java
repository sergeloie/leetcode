package arrays;

import java.util.Arrays;

public class MinimumOperationsToExceedThresholdValue1_3065 {
    public int minOperations(int[] nums, int k) {
        return (int) Arrays.stream(nums)
                .filter(num -> num < k)
                .count();
    }
}

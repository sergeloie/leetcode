package arrays;

import java.util.Arrays;

public class MinimumOperationsToMakeArraySumDivisibleByK_3512 {
    public int minOperations(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        if (sum < k) {
            return sum;
        } else {
            return sum % k;
        }
    }
}

package arrays;

import java.util.Arrays;

public class SumOfAllSubsetXORTotals_1863 {

    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int mask = 0; mask < (1 << n); mask++) {
            int xor = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    xor ^= nums[i];
                }
            }
            sum += xor;

        }
        return sum;
    }

    public int subsetXORSum2(int[] nums) {
        return (int) Math.pow(2, nums.length - 1) * Arrays.stream(nums).reduce(0, (x, y) -> x | y);
    }
}

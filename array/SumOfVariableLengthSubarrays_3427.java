package array;

import java.util.Arrays;

public class SumOfVariableLengthSubarrays_3427 {
    public int subarraySum(int[] nums) {
        int result = 0;
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < sums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }
        for (int i = 0; i < sums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            if (start == 0) {
                result += sums[i];
            } else {
                result += sums[i] - sums[start - 1];
            }
        }
        return result;
    }
}

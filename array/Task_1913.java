package array;

import java.util.Arrays;

public class Task_1913 {
    public int maxProductDifference(int[] nums) {
        int min0 = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max0 = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num <= min0) {
                min1 = min0;
                min0 = num;
            }

            if (num > min0 && num < min1) {
                min1 = num;
            }

            if (num >= max1) {
                max0 = max1;
                max1 = num;
            }

            if (num < max1 && num > max0) {
                max0 = num;
            }
        }

        return max0 * max1 - min0 * min1;
    }
}

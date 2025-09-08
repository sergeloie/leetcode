package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAverageOfSmallestAndLargestElements_3194 {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min = Double.MAX_VALUE;
        for (int i = 0; i < nums.length / 2; i++) {
            double average = (double) (nums[i] + nums[nums.length - 1 - i]) / 2;
            min = Math.min(min, average);
        }
        return min;

    }
}

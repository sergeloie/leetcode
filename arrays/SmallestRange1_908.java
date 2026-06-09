package arrays;

public class SmallestRange1_908 {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return Math.max(0, max - min - 2 * k);
    }

}

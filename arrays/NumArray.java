package arrays;

public class NumArray {

    public int[] nums;
    public int[] sums;

    public NumArray(int[] nums) {
        this.nums = nums;
        this.sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < sums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
    }

    public int sumRange(int left, int right) {
        return sums[right] + nums[left] - sums[left];
    }
}

package array_plus;

public class MonotonicArray_896 {
    public boolean isMonotonic(int[] nums) {
        int l = 1;
        int r = nums.length - 2;
        while (l <= r) {
            if ((nums[l] >= nums[l - 1] & nums[r + 1] >= nums[r]) ||  (nums[l] <= nums[l - 1] & nums[r + 1] <= nums[r])) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}

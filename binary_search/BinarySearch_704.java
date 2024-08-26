package binary_search;

public class BinarySearch_704 {
    public int search(int[] nums, int target) {
        int l = -1;
        int r = nums.length;
        while (l + 1 < r) {
            int mid = (l + r) / 2;
            if (good(nums[mid], target)) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return nums[l] == target ? l : -1;
    }

    public boolean good(int value, int target) {
        return value <= target;
    }
}

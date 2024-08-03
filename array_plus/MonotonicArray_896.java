package array_plus;
/*
https://leetcode.com/problems/monotonic-array/description/
896. Monotonic Array
Easy
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.



Example 1:

Input: nums = [1,2,2,3]
Output: true
Example 2:

Input: nums = [6,5,4,4]
Output: true
Example 3:

Input: nums = [1,3,2]
Output: false
 */

public class MonotonicArray_896 {
    public boolean isMonotonic(int[] nums) {
        return nums[0] < nums[nums.length - 1] ? isMonotonicInc(nums) : isMonotonicDec(nums);
    }

    public boolean isMonotonicInc(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean isMonotonicDec(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

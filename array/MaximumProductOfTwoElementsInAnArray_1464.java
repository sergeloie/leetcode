package array;
/*
https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
1464. Maximum Product of Two Elements in an Array
Easy
Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).



Example 1:

Input: nums = [3,4,5,2]
Output: 12
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.

Example 2:

Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.

Example 3:

Input: nums = [3,7]
Output: 12

 */

public class MaximumProductOfTwoElementsInAnArray_1464 {
    public int maxProduct(int[] nums) {
        int maxUp = Math.max(nums[0], nums[1]);
        int maxDown = Math.min(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int candidate = nums[i];
            if (candidate > maxUp) {
                maxDown = maxUp;
                maxUp = candidate;
            } else if (candidate > maxDown) {
                maxDown = candidate;
            }
        }
        return (maxUp - 1) * (maxDown - 1);
    }
}

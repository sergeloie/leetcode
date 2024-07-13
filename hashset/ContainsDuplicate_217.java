package hashset;

/*
https://leetcode.com/problems/contains-duplicate/description/
217. Contains Duplicate
Easy

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]
Output: true

Example 2:

Input: nums = [1,2,3,4]
Output: false

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

 */

import java.util.Arrays;

public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        long size = nums.length;
        long count = Arrays.stream(nums).distinct().count();
        return count < size;
    }

    /*
    3 times faster then upper solution
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            };
        }
        return set.size() != nums.length;
    }
     */
}

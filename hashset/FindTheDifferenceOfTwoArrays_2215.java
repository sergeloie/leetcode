package hashset;

/*
https://leetcode.com/problems/find-the-difference-of-two-arrays/description/
2215. Find the Difference of Two Arrays
Easy

Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

    answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
    answer[1] is a list of all distinct integers in nums2 which are not present in nums1.

Note that the integers in the lists may be returned in any order.



Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].

Example 2:

Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTheDifferenceOfTwoArrays_2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        var set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        var set11 = Set.copyOf(set1);
        var set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        set1.removeAll(set2);
        set2.removeAll(set11);

        return List.of(new ArrayList<>(set1), new ArrayList<>(set2));
    }
}

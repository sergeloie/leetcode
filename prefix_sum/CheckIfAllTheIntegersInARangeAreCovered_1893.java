package prefix_sum;

/*
https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/description/
1893. Check if All the Integers in a Range Are Covered
Easy

You are given a 2D integer array ranges and two integers left and right. Each ranges[i] = [starti, endi] represents an inclusive interval between starti and endi.

Return true if each integer in the inclusive range [left, right] is covered by at least one interval in ranges. Return false otherwise.

An integer x is covered by an interval ranges[i] = [starti, endi] if starti <= x <= endi.



Example 1:

Input: ranges = [[1,2],[3,4],[5,6]], left = 2, right = 5
Output: true
Explanation: Every integer between 2 and 5 is covered:
- 2 is covered by the first range.
- 3 and 4 are covered by the second range.
- 5 is covered by the third range.

Example 2:

Input: ranges = [[1,10],[10,20]], left = 21, right = 21
Output: false
Explanation: 21 is not covered by any range.

 */

public class CheckIfAllTheIntegersInARangeAreCovered_1893 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] prefixSum = new int[52];
        for (int i = 0; i < ranges.length; i++) {
            int start = ranges[i][0];
            int end = ranges[i][1];
            prefixSum[start] = prefixSum[start] + 1;
            prefixSum[end + 1] = prefixSum[end + 1] - 1;
        }
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i] + prefixSum[i - 1];
        }

        for (int i = left; i <=right ; i++) {
            if (prefixSum[i] == 0) {
                return false;
            }
        }
        return true;
    }
}

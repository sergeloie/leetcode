package array_plus;
/*
https://leetcode.com/problems/summary-ranges/description/
228. Summary Ranges
Easy
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b


Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
 */

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;
        int xStart = nums[0];
        int xPrev = nums[0];
        int xCurrent;

        for (int i = 1; i < nums.length; i++) {
            xCurrent = nums[i];
            if (xCurrent - xPrev == 1) {
                xPrev = xCurrent;
            } else {
                if (xPrev == xStart) {
                    result.add(String.valueOf(xStart));
                } else {
                    result.add(xStart + "->" + xPrev);
                }
                xStart = xCurrent;
                xPrev = xCurrent;
            }
        }
        if (xPrev == xStart) {
            result.add(String.valueOf(xStart));
        } else {
            result.add(xStart + "->" + xPrev);
        }
        return result;
    }
}

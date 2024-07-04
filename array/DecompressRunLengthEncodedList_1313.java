package array;
/*
https://leetcode.com/problems/decompress-run-length-encoded-list/description/
1313. Decompress Run-Length Encoded List
Easy
We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.

Return the decompressed list.



Example 1:

Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
Example 2:

Input: nums = [1,1,2,3]
Output: [1,3,3]
 */

import java.util.stream.IntStream;

public class DecompressRunLengthEncodedList_1313 {
    public int[] decompressRLElist(int[] nums) {
//        int size = IntStream.range(0, nums.length)
//                .filter(i -> i % 2 == 0)
//                .map(i -> nums[i])
//                .sum();

        int[] result = IntStream.range(0, nums.length / 2)
                .flatMap(i -> IntStream.generate(() -> nums[i * 2 + 1])
                        .limit(nums[i * 2]))
                .toArray();
        return result;
    }
}

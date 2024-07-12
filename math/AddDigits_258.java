package math;

/*
https://leetcode.com/problems/add-digits/description/
258. Add Digits
Easy
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.



Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0
 */

import java.util.Arrays;

public class AddDigits_258 {
    public int addDigits(int num) {
        if (num <= 9) return num;
        return addDigits(Arrays.stream(String.valueOf(num).split(""))
                .map(Integer::valueOf).reduce(0, Integer::sum));
    }
}

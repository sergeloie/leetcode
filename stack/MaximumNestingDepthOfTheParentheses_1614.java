/*
https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
1614. Maximum Nesting Depth of the Parentheses
Easy

Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.



Example 1:

Input: s = "(1+(2*3)+((8)/4))+1"

Output: 3

Explanation:

Digit 8 is inside of 3 nested parentheses in the string.

Example 2:

Input: s = "(1)+((2))+(((3)))"

Output: 3

Explanation:

Digit 3 is inside of 3 nested parentheses in the string.

Example 3:

Input: s = "()(())((()()))"

Output: 3

 */

package stack;

import java.util.ArrayDeque;

public class MaximumNestingDepthOfTheParentheses_1614 {
    public int maxDepth(String s) {

        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                max = Math.max(max, ++count);
            } else if (s.charAt(i) == ')') {
                count--;
            }
        }
        return max;
    }
}

/*
https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
1047. Remove All Adjacent Duplicates In String
Easy

You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.



Example 1:

Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

Example 2:

Input: s = "azxxzy"
Output: "ay"

 */

package stack;

import java.util.ArrayDeque;

public class RemoveAllAdjacentDuplicatesInString_1047 {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (arrayDeque.peekFirst() != null && arrayDeque.peekFirst() == current) {
                arrayDeque.pop();
            } else {
                arrayDeque.push(current);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!arrayDeque.isEmpty()) {
            sb.append(arrayDeque.pollLast());
        }
        return sb.toString();
    }
}

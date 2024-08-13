package two_pointers;

/*
https://leetcode.com/problems/reverse-string-ii/description/
541. Reverse String II
Easy
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.



Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:

Input: s = "abcd", k = 2
Output: "bacd"
 */

public class ReverseString2_541 {
    public String reverseStr(String s, int k) {
        char[] letters = s.toCharArray();
        int lastIndex = letters.length - 1;
        int currentPosition = 0;
        while (currentPosition <= lastIndex) {
            int rightIndex = Math.min(currentPosition + k - 1, lastIndex);
            swap(letters, currentPosition, rightIndex);
            currentPosition += k * 2;
        }
        return new String(letters);
    }

    public void swap(char[] letters, int start, int end) {
        int l = start;
        int r = end;
        while (l < r) {
            char temp = letters[l];
            letters[l] = letters[r];
            letters[r] = temp;
            l++;
            r--;
        }
    }


}

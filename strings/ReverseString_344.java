package strings;

/*
https://leetcode.com/problems/reverse-string/description/
344. Reverse String
Easy

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

 */

public class ReverseString_344 {
    public void reverseString(char[] s) {
        int lastIndex = s.length - 1;
        int limitIndex = s.length / 2 - 1;
        for (int i = 0; i <= limitIndex; i++) {
            char temp = s[i];
            s[i] = s[lastIndex - i];
            s[lastIndex - i] = temp;
        }
    }
}

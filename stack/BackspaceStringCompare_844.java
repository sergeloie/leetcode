/*
https://leetcode.com/problems/backspace-string-compare/description/
844. Backspace String Compare
Easy

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.



Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".



Constraints:

    1 <= s.length, t.length <= 200
    s and t only contain lowercase letters and '#' characters.

 */
package stack;

import java.util.ArrayDeque;

public class BackspaceStringCompare_844 {
    public boolean backspaceCompare(String s, String t) {
        ArrayDeque<Character> sStack = new ArrayDeque<>();
        ArrayDeque<Character> tStack = new ArrayDeque<>();
        fillStack(s, sStack);
        fillStack(t, tStack);
        return sStack.toString().equals(tStack.toString());
    }

    public void fillStack(String string, ArrayDeque<Character> arrayDeque) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '#') {
                arrayDeque.pollLast();
            } else {
                arrayDeque.addLast(string.charAt(i));
            }
        }
    }
}

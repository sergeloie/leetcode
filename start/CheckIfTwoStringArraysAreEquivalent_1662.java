package start;
/*
https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
1662. Check If Two String Arrays are Equivalent
Easy
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
*/

import java.util.Arrays;

public class CheckIfTwoStringArraysAreEquivalent_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        var something1 = Arrays.stream(word1)
                .flatMapToInt(String::chars)
                .boxed()
                .toList();
        var something2 = Arrays.stream(word2)
                .flatMapToInt(String::chars)
                .boxed()
                .toList();
        return something1.equals(something2);
    }
}

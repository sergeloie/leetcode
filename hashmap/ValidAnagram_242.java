package hashmap;

/*
https://leetcode.com/problems/valid-anagram/description/
242. Valid Anagram
Easy
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        Map<String, Long> sMap = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> tMap = Arrays.stream(t.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return sMap.equals(tMap);
    }

/*    public boolean isAnagram2(String s, String t) {
        int[] sArr = strToArr(s);
        int[] tArr = strToArr(t);
        return Arrays.equals(sArr, tArr);
    }

    public int[] strToArr(String str) {
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            arr[index] = arr[index] + 1;
        }
        return arr;
    }*/
}

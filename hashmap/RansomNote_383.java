package hashmap;

/*
https://leetcode.com/problems/ransom-note/description/
383. Ransom Note
Easy

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true

 */

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RansomNote_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<String, Long> rMap = Arrays.stream(ransomNote.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> mMap = Arrays.stream(magazine.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry<String, Long> entry : rMap.entrySet()) {
            String s = entry.getKey();
            if (mMap.get(s) == null || entry.getValue() > mMap.get(s)) {
                return false;
            }
        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        int[] mArr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            int index = magazine.charAt(i) - 'a';
            mArr[index] = mArr[index] + 1;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            if (mArr[index] == 0) {
                return false;
            } else {
                mArr[index] = mArr[index] - 1;
            }
        }
        return true;
    }
}

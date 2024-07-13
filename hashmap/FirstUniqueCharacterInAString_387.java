package hashmap;

/*
https://leetcode.com/problems/first-unique-character-in-a-string/description/
387. First Unique Character in a String
Easy

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.



Example 1:

Input: s = "leetcode"
Output: 0

Example 2:

Input: s = "loveleetcode"
Output: 2

Example 3:

Input: s = "aabb"
Output: -1

 */

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString_387 {
    public int firstUniqChar(String s) {
        String[] strArr = s.split("");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            int finalI = i;
            map.compute(strArr[i], (k, v) -> v == null ? finalI : Integer.MAX_VALUE);
        }
        int result =  map.values().stream().min(Integer::compareTo).get();
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}

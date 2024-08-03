package hashmap;

/*
https://leetcode.com/problems/group-anagrams/description/
49. Group Anagrams
Medium
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = Arrays.stream(strs)
                .collect(Collectors.groupingBy(this::sortWord, Collectors.toList()));
        return hashMap.values().stream().toList();
    }

    public String sortWord(String word) {
        return Arrays.stream(word.split(""))
                .sorted()
                .collect(Collectors.joining());
    }
}

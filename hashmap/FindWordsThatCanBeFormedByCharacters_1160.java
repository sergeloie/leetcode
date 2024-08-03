package hashmap;

/*
https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/

Code
Testcase
Testcase
Test Result
1160. Find Words That Can Be Formed by Characters
Easy
You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.



Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 */

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindWordsThatCanBeFormedByCharacters_1160 {
    public int countCharacters(String[] words, String chars) {
        Map<String, Long> source = strToMap(chars);
        int count = 0;
        for (String word : words) {
            if (canConstruct(source, strToMap(word))) {
                count += word.length();
            }
        }
        return count;
    }

    public Map<String, Long> strToMap(String word) {
        return Arrays.stream(word.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public boolean canConstruct(Map<String, Long> source, Map<String, Long> target) {
        for (Map.Entry<String, Long> entry : target.entrySet()) {
            String key = entry.getKey();
            if (source.get(key) == null || source.get(key) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }


}

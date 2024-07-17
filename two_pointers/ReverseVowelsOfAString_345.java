package two_pointers;

/*
https://leetcode.com/problems/reverse-vowels-of-a-string/description/
345. Reverse Vowels of a String
Easy
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"


Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ReverseVowelsOfAString_345 {
    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;
        Set<String> vowels = Set.of("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");
        List<String> result = Arrays.asList(s.split(""));
        while (l < r) {
            while (l < result.size() && !vowels.contains(result.get(l))) {
                l++;
            }
            while (r >= 0 && !vowels.contains(result.get(r))) {
                r--;
            }
            if (l < r) {
                String temp = result.get(l);
                result.set(l, result.get(r));
                result.set(r, temp);
            }
            l++;
            r--;
        }
        return String.join("", result);
    }
}

package hashmap;

/*
https://leetcode.com/problems/unique-number-of-occurrences/description/
1207. Unique Number of Occurrences
Easy
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.



Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 */

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueNumberOfOccurrences_1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Long> map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long count = map.values().stream()
                .distinct()
                .count();
        return count == map.size();
    }
}

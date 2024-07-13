package hashset;

/*
https://leetcode.com/problems/jewels-and-stones/description/
771. Jewels and Stones
Easy

You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".



Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0

 */

import java.util.Arrays;
import java.util.Set;

public class JewelsAndStones_771 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<String> jSet = Set.of(jewels.split(""));
        long result = Arrays.stream(stones.split(""))
                .filter(jSet::contains)
                .count();
        return (int) result;
    }
}

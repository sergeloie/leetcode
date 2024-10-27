/*
https://leetcode.com/problems/daily-temperatures/description/
739. Daily Temperatures
Medium

Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.



Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]

Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]



Constraints:

    1 <= temperatures.length <= 105
    30 <= temperatures[i] <= 100


 */
package stack;

import java.util.SortedMap;
import java.util.TreeMap;

public class DailyTemperatures_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        SortedMap<Integer, Integer> map = new TreeMap<>();
        for (int i = temperatures.length - 1; i >= 0; i--) {
            Integer nearest = findNearest(temperatures[i], map);
            result[i] = nearest == 0 ? 0 : nearest - i;
            map.put(temperatures[i], i);
        }
        return result;
    }

    public Integer findNearest(Integer currentTemp, SortedMap<Integer, Integer> map) {
        return map.tailMap(currentTemp + 1)
                .values().stream()
                .min(Integer::compareTo).orElse(0);
    }
}

package prefix_sum;

/*
https://leetcode.com/problems/points-that-intersect-with-cars/
2848. Points That Intersect With Cars
Easy

You are given a 0-indexed 2D integer array nums representing the coordinates of the cars parking on a number line. For any index i, nums[i] = [starti, endi] where starti is the starting point of the ith car and endi is the ending point of the ith car.

Return the number of integer points on the line that are covered with any part of a car.



Example 1:

Input: nums = [[3,6],[1,5],[4,7]]
Output: 7
Explanation: All the points from 1 to 7 intersect at least one car, therefore the answer would be 7.

Example 2:

Input: nums = [[1,3],[5,8]]
Output: 7
Explanation: Points intersecting at least one car are 1, 2, 3, 5, 6, 7, 8. There are a total of 7 points, therefore the answer would be 7.

 */

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PointsThatIntersectWithCars_2848 {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] edges = new int[102];
        for (List<Integer> num : nums) {
            edges[num.getFirst()] = edges[num.getFirst()] + 1;
            edges[num.getLast() + 1] = edges[num.getLast() + 1] - 1;
        }
//        Вычисляем префиксные суммы и Считаем положительные значения
        int count = 0;
        for (int i = 1; i < edges.length; i++) {
            edges[i] = edges[i] + edges[i - 1];
            count = edges[i] > 0 ? count + 1 : count;
        }
        return count;
    }

    public int numberOfPointsWithMap(List<List<Integer>> nums) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for(List<Integer> num : nums) {
            treeMap.compute(num.getFirst(), (k, v) -> v == null ? 1 : v + 1);
            treeMap.compute(num.getLast(), (k, v) -> v == null ? -1 : v - 1);
        }
        int previousValue = 0;
        int start = 0;
        int sum = 0;

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            int currentEdge = entry.getKey();
            int currentValue = previousValue + entry.getValue();
            if (previousValue < 1) {
                start = currentEdge;
            }
            if (currentValue == 0) {
                sum += currentEdge - start + 1;
            }
            previousValue = currentValue;
        }
        return sum;
    }
}

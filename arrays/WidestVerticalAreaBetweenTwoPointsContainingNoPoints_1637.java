package arrays;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints_1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        SortedSet<Integer> set = new TreeSet<>();
        for (int[] point : points) {
            set.add(point[0]);
        }
        int distance = 0;
        int first = set.removeFirst();
        int second;
        while(!set.isEmpty()) {
            second = set.removeFirst();
            distance = Math.max(distance, second - first);
            first = second;
        }
        return distance;
    }

    public int maxWidthOfVerticalArea2(int[][] points) {
        int[] arr = Arrays.stream(points)
                .map(point -> point[0])
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
        int distance = 0;
        int first = arr[0];
        for (int x : arr) {
            distance = Math.max(distance, x - first);
            first = x;

        }
        return distance;
    }

}

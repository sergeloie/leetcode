package array;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCommonElementsBetweenTwoArrays_2956 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        Map<Integer, Long> map1 = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Integer, Long> map2 = Arrays.stream(nums2).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int answer1 = map1.entrySet().stream()
                .filter(entry -> map2.containsKey(entry.getKey()))
                .map(Map.Entry::getValue)
                .map(Long::intValue)
                .reduce(0, Integer::sum);

        int answer2 = map2.entrySet().stream()
                .filter(entry -> map1.containsKey(entry.getKey()))
                .map(Map.Entry::getValue)
                .map(Long::intValue)
                .reduce(0, Integer::sum);

        return new int[]{answer1, answer2};
    }

    public int[] findIntersectionValues2(int[] nums1, int[] nums2) {
        int[] num1Count = new int[101];
        int[] num2Count = new int[101];

        for (int num: nums1) {
            num1Count[num] = 1;
        }

        for (int num: nums2) {
            num2Count[num] = 1;
        }

        int answer1 = 0;
        int answer2 = 0;

        for (int num: nums1) {
            if (num2Count[num] > 0) {
                answer1++;
            }
        }

        for (int num: nums2) {
            if (num1Count[num] > 0) {
                answer2++;
            }
        }

        return new int[]{answer1, answer2};

    }
}

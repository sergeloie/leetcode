package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntersectionofTwoArrays2_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Long> map1 = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Integer, Long> map2 = Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Long> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                int count = Math.toIntExact(Math.min(entry.getValue(), map2.get(entry.getKey())));
                for (int i = 0; i < count; i++) {
                    result.add(Math.toIntExact(entry.getKey()));
                }
            }
        }
        return result.stream().mapToInt(x -> x).toArray();

    }
}

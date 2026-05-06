package arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestHarmoniousSubsequence_594 {
    public int findLHS(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long result = 0;
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            int i = entry.getKey();
            if (map.get(i + 1) != null) {
                result = Math.max(result, entry.getValue() + map.get(i + 1));
            }
        }
        return (int) result;
    }
}

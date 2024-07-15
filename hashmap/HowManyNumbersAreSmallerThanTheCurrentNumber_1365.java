package hashmap;

/*
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
 */

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HowManyNumbersAreSmallerThanTheCurrentNumber_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Long> map = new TreeMap<>();
        map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long count = 0;
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            long temp = entry.getValue();
            entry.setValue(count);
            count += temp;
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]).intValue();
        }
        return result;
    }
}

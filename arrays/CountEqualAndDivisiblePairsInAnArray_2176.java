package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CountEqualAndDivisiblePairsInAnArray_2176 {
    public int countPairs(int[] nums, int k) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int finalI = i;
            map.compute(nums[i], (key, list) -> {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(finalI);
                return list;
            });
        }

        return map.values().stream()
                .filter(list -> list.size() > 1)
                .map(list -> processList(list, k))
                .reduce(Integer::sum)
                .orElse(0);
    }

    public int processList(List<Integer> list, int k) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) * list.get(j) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

}

package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MinimumIndexSumOfTwoLists_599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, int[]> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], new int[]{i, -1});
        }

        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                map.get(list2[i])[1] = i;
            }

        }

        map.entrySet().removeIf(entry -> entry.getValue()[1] == -1);

        Map<String, Integer> result = map.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue()[0] + entry.getValue()[1]));

        int minValue = result.values().stream().min(Integer::compareTo).get();
        return result.entrySet().stream()
                .filter(entry -> entry.getValue() == minValue)
                .map(Map.Entry::getKey)
                .toArray(String[]::new);

    }
}

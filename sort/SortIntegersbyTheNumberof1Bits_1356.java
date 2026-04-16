package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortIntegersbyTheNumberof1Bits_1356 {
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer, List<Integer>> map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        Integer::bitCount,
                        TreeMap::new,
                        Collectors.toList()
                ));

        List<Integer> result = new ArrayList<>();
        map.forEach((key, list) -> {
            list.sort(Integer::compareTo);
            result.addAll(list);
        });

        return result.stream().mapToInt(Integer::intValue).toArray();

    }


}

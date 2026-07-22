package arrays;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberofEquivalentDominoPairs_1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        var map = Arrays.stream(dominoes)
                .map(this::normalize)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return map.values().stream()
                .filter(value -> value > 1)
                .map(value -> value * (value - 1) / 2)
                .reduce(0L, Long::sum).intValue();

    }

    private int normalize(int[] arr) {
        int l = Math.min(arr[0], arr[1]);
        int r = Math.max(arr[0], arr[1]);
        return l * 10 + r;
    }
}

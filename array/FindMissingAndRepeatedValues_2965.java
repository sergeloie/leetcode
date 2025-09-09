package array;

import java.util.Arrays;
import java.util.BitSet;

public class FindMissingAndRepeatedValues_2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        BitSet bitSet = new BitSet(n * n + 1);
        int[] result = new int[2];
        Arrays.stream(grid).flatMapToInt(Arrays::stream)
                .forEach(x -> {
                    if (bitSet.get(x)) {
                        result[0] = x;
                    }
                    bitSet.set(x);
                });
        result[1] = bitSet.nextClearBit(1);
        return result;
    }
}

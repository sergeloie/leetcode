package hashset;

import java.util.BitSet;

public class DistributeCandies_575 {
    public int distributeCandies(int[] candyType) {
        BitSet bitSet = new BitSet(20001);
        for (int c : candyType) {
            bitSet.set(c + 10000);
        }
        return Math.min(bitSet.cardinality(), candyType.length / 2);
    }
}

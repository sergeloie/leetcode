package array;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        BitSet bitSet = new BitSet(nums.length + 1);
        for(int num : nums) {
            bitSet.set(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length ; i++) {
            if (!bitSet.get(i)) {
                result.add(i);
            }
        }
        return result;
    }
}

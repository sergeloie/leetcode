package array;

import java.util.HashSet;
import java.util.Set;

public class SetMismatch_645 {
    public int[] findErrorNums(int[] nums) {
        int last = nums.length;
        int doubled = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                doubled = num;
            }
        }
        int lost = 0;
        for (int i = 1; i <= last; i++) {
            if (!set.contains(i)) {
                lost = i;
                break;
            }
        }
        return new int[]{doubled, lost};
    }

}

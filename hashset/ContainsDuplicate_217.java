package hashset;

import java.util.Arrays;

public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        long size = nums.length;
        long count = Arrays.stream(nums).distinct().count();
        return count < size;
    }

    /*
    3 times faster then upper solution
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            };
        }
        return set.size() != nums.length;
    }
     */
}

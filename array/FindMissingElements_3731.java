package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElements_3731 {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int lastIndex = nums.length - 1;
        if (nums[lastIndex] - nums[0] == lastIndex) {
            return result;
        }

        int first = nums[0];
        int last = nums[lastIndex];
        int index = 0;

        for (int i = first; i <= last; i++) {
            if (nums[index] == i) {
                index++;
            } else {
                result.add(i);
            }
        }

        return result;
    }
}

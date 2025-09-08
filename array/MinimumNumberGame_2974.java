package array;

import java.util.Arrays;

public class MinimumNumberGame_2974 {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i * 2];
            nums[i * 2] = nums[i * 2 + 1];
            nums[i * 2 + 1] = temp;
        }
        return nums;

    }
}

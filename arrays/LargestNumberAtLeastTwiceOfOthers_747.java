package arrays;

public class LargestNumberAtLeastTwiceOfOthers_747 {
    public int dominantIndex(int[] nums) {
        int biggestIndex;
        int biggestValue;
        int bigValue;

        if (nums[0] > nums[1]) {
            biggestIndex = 0;
            biggestValue = nums[0];
            bigValue = nums[1];
        } else {
            biggestIndex = 1;
            biggestValue = nums[1];
            bigValue = nums[0];
        }

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > biggestValue) {
                bigValue = biggestValue;
                biggestIndex = i;
                biggestValue = nums[i];
            } else if (nums[i] > bigValue) {
                bigValue = nums[i];
            }
        }
        if (biggestValue >= bigValue * 2) {
            return biggestIndex;
        }
        return -1;
    }
}

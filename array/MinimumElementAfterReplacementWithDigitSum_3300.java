package array;

import java.util.Arrays;

public class MinimumElementAfterReplacementWithDigitSum_3300 {
    public int minElement(int[] nums) {
        return Arrays.stream(nums)
                .map(this::sumDigit)
                .min()
                .getAsInt();
    }

    public int sumDigit(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num = num / 10;
        }
        return result;
    }
}

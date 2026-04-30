package arrays;

import java.util.Arrays;
import java.util.function.Function;

public class SeparatetheDigitsinanArray_2553 {
    public int[] separateDigits(int[] nums) {
        return Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .flatMap(str -> str.chars().mapToObj(c -> c - '0'))
                .mapToInt(Integer::intValue)
                .toArray();

    }
}

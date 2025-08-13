package arrays;

import java.util.Arrays;

public class DifferenceBetweenElementSumndDigitSumOfAnArray_2535 {
    public int differenceOfSum(int[] nums) {
        int elementSum = Arrays.stream(nums).sum();

        int digitSum = Arrays.stream(nums)
                .mapToObj(Integer::toString)
                .flatMap(str -> str.chars().mapToObj(c -> c - '0'))
                .reduce(0, Integer::sum);
        return Math.abs(elementSum - digitSum);
    }
}

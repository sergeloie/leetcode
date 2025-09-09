package array;

import java.util.List;

public class SumOfValuesAtIndicesWithKSetBits_2859 {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += Integer.bitCount(i) == k ? nums.get(i) : 0;
        }
        return sum;
    }
}

import hashmap.FindWordsThatCanBeFormedByCharacters_1160;
import hashmap.RansomNote_383;
import hashmap.TwoSum_1;
import math.AddDigits_258;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum_1 cls = new TwoSum_1();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = cls.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

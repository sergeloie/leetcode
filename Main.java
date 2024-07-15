import hashmap.FindWordsThatCanBeFormedByCharacters_1160;
import hashmap.HowManyNumbersAreSmallerThanTheCurrentNumber_1365;
import hashmap.RansomNote_383;
import hashmap.TwoSum_1;
import math.AddDigits_258;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HowManyNumbersAreSmallerThanTheCurrentNumber_1365 cls = new HowManyNumbersAreSmallerThanTheCurrentNumber_1365();
        int[] nums = {8,1,2,2,3};
        int target = 9;
        int[] result = cls.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }
}

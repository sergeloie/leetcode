import hashmap.HowManyNumbersAreSmallerThanTheCurrentNumber_1365;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HowManyNumbersAreSmallerThanTheCurrentNumber_1365 cls = new HowManyNumbersAreSmallerThanTheCurrentNumber_1365();
        int[] nums = {60,14,3,39,49,43,53,24,33,13,32,93,65,26,77,55,2,28,2,50,18,4,92,20,57,90,64,86,54,69,28,80,88,66,57,28,67,83,3,50,86};
        int[] result = cls.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }
}

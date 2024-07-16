import hashmap.CountNumberOfPairsWithAbsoluteDifferenceK_2006;
import hashmap.HowManyNumbersAreSmallerThanTheCurrentNumber_1365;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CountNumberOfPairsWithAbsoluteDifferenceK_2006 cls = new CountNumberOfPairsWithAbsoluteDifferenceK_2006();
        int[] nums = {1,2,2,1};
        var result = cls.countKDifference(nums, 1);
        System.out.println((result));
    }
}

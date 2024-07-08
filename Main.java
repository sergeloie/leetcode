import array.LeftAndRightSumDifferences_2574;
import array_plus.FindTheHighestAltitude_1732;
import array_plus.LongestContinuousIncreasingSubsequence_674;
import array_plus.MonotonicArray_896;
import array_plus.ValidMountainArray_941;
import matrix.ToeplitzMatrix_766;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ValidMountainArray_941 cls = new ValidMountainArray_941();
        int[] test = {0,1,2,3,4,5,6,7,8,9};
        boolean result = cls.validMountainArray(test);
        System.out.println(result);
    }
}

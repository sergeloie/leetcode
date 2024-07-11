import array.LeftAndRightSumDifferences_2574;
import array_plus.FindTheHighestAltitude_1732;
import array_plus.LongestContinuousIncreasingSubsequence_674;
import array_plus.MonotonicArray_896;
import array_plus.SummaryRanges_228;
import array_plus.ValidMountainArray_941;
import matrix.ToeplitzMatrix_766;
import strings.ShuffleString_1528;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ShuffleString_1528 cls = new ShuffleString_1528();
        int[] indices = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
        var result = cls.restoreString(s, indices);
        System.out.println(result);
    }
}

import array.LeftAndRightSumDifferences_2574;
import array_plus.FindTheHighestAltitude_1732;
import array_plus.LongestContinuousIncreasingSubsequence_674;
import matrix.ToeplitzMatrix_766;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FindTheHighestAltitude_1732 cls = new FindTheHighestAltitude_1732();
        int[] test = {-4,-3,-2,-1,4,3,2};
        int result = cls.largestAltitude(test);
        System.out.println(result);
    }

}

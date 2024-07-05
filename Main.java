import array.LeftAndRightSumDifferences_2574;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LeftAndRightSumDifferences_2574 lfm = new LeftAndRightSumDifferences_2574();
        int[] test = {10,4,8,3};
        int[] result = lfm.leftRightDifference(test);
        System.out.println(Arrays.toString(result));
    }
}

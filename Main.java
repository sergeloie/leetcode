import array.LeftAndRightSumDifferences_2574;
import matrix.ToeplitzMatrix_766;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ToeplitzMatrix_766 lfm = new ToeplitzMatrix_766();
        int[][] test = {{1,2}, {2,2}};
        boolean result = lfm.isToeplitzMatrix(test);
        System.out.println(result);
    }
}

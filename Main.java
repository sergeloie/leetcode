import array.FindSmallestLetterGreaterThanTarget_744;
import array.SetMismatch_645;
import hashmap.MaximumNumberOfBalloons_1189;
import matrix.ProjectionAreaOf3DShapes_883;
import matrix.SurfaceAreaOf3DShapes_892;
import strings.FlipStringToMonotoneIncreasing_926;
import strings.MinimumCostToMakeAllCharactersEqual_2712;
import strings.UniqueEmailAddresses_929;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var klass = new MaximumNumberOfBalloons_1189();
        int[][] grid = new int[][]{{1, 2}, {3, 4}};
        int[][] grid2 = new int[][]{{2}};
        int[][] grid4 = new int[][]{{1, 0}, {0, 2}};
        int[][] grid3 = new int[][]{{2,2,2},{2,1,2},{2,2,2}};

        String[] emails = new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        String text = "leetcode";
        System.out.println(klass.maxNumberOfBalloons(text));
    }
}



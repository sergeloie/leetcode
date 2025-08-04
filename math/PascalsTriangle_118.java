package math;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        for (int i = 0; i < numRows ; i++) {
            result.add(getRow(i));
        }
        return result;
    }

    public List<Integer> getRow(int n) {
        List<Integer> result = new ArrayList<>(n + 1);
        long current;
        result.add(1);
        for (int i = 1; i <= n; i++) {
            current = (long) result.get(i - 1) * (n - i + 1) / i ;
            result.add((int) current);
        }
        return result;
    }
}

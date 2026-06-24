package strings;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups_830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        if (s.length() < 3) {
            return result;
        }
        int l = 0;
        int count = 1;
        for (int r = 1; r < s.length(); r++) {
            if (s.charAt(l) == s.charAt(r)) {
                count++;
            } else {
                if (count >= 3) {
                    result.add(List.of(l, r - 1));
                }
                l = r;
                count = 1;
            }
        }
        if (count >= 3) {
            result.add(List.of(l, s.length() - 1));
        }
        return result;
    }
}

package strings;

public class MinimumCostToMakeAllCharactersEqual_2712 {
    public long minimumCost(String s) {
        long count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                long min = Math.min(i + 1, s.length() - i - 1);
                count += min;
            }
        }
        return count;
    }
}

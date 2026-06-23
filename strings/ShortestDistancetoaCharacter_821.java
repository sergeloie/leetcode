package strings;

import java.util.SortedSet;
import java.util.TreeSet;

public class ShortestDistancetoaCharacter_821 {
    public int[] shortestToChar(String s, char c) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                set.add(i);
            }
        }
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                result[i] = 0;
            } else {
                int low = set.ceiling(i) == null ? Integer.MAX_VALUE : set.ceiling(i);
                int high = set.floor(i) == null ? Integer.MAX_VALUE : set.floor(i);
                result[i] = Math.min(Math.abs(low - i), Math.abs(high - i));

            }
        }
        return result;
    }
}

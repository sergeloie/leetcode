package strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestPalindrome_409 {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.compute(ch, (k, v) -> v == null ? 1 : v + 1);
        }
        List<Integer> list = map.values().stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(ArrayList::new));

        Integer count = list.stream()
                .filter(n -> n % 2 != 0)
                .max(Integer::compareTo).orElse(0);
        list.remove(count);
        boolean singleScored = count % 2 != 0;
        for (Integer integer : list) {
            if (integer != 1) {
                count += integer  >> 1 << 1;
            } else if (!singleScored) {
                count++;
                singleScored = true;
            }
        }
        return count;
    }
}

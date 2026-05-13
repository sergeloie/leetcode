package hashset;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AssignCookies_455 {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        List<Integer> kids = Arrays.stream(g).boxed().sorted().toList();
        TreeMap<Integer, Long> cookies = Arrays.stream(s).boxed()
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
        for (Integer kid: kids) {
            Integer key = cookies.ceilingKey(kid);
            if (key != null) {
                count++;
                cookies.computeIfPresent(key, (k, v) -> v > 1 ? v - 1 : null);
            }
        }
        return count;
    }
}

package hashmap;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons_1189 {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);

        for (Character ch : text.toCharArray()) {
            map.computeIfPresent(ch, (k, v) -> v + 1);
        }

        map.compute('l', (k, v) -> v / 2);
        map.compute('o', (k, v) -> v / 2);

        return map.values().stream().min(Integer::compareTo).get();
    }
}

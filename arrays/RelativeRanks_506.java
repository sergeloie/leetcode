package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks_506 {
    public String[] findRelativeRanks(int[] score) {
        int[] places = Arrays.copyOf(score, score.length);
        Arrays.sort(places);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < places.length; i++) {
            map.put(places[i], places.length - i);
        }
        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int num = map.get(score[i]);
            result[i] = switch (num) {
                case 1 -> "Gold medal";
                case 2 -> "Silver medal";
                case 3 -> "Bronze medal";
                default -> String.valueOf(num);
            };
        }
        return result;
    }
}

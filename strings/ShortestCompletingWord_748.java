package strings;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord_748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.replaceAll("[1-9]", "").replaceAll("\\s+", "").toLowerCase();
        Map<Character, Long> plate = wordToMap(licensePlate);
        int length = Integer.MAX_VALUE;
        String result = "";
        for (String word : words) {
            if (isComplete(plate, wordToMap(word)) && word.length() < length) {
                result = word;
                length = word.length();
            }
        }
        return result;
    }

    private Map<Character, Long> wordToMap(String word) {
        Map<Character, Long> map = new HashMap<>();
        for (char ch : word.toCharArray()) {
            map.compute(ch, (k, v) -> v == null ? 1 : v + 1);
        }
        return map;
    }

    private boolean isComplete(Map<Character, Long> plate, Map<Character, Long> word) {
        for (Character ch : plate.keySet()) {
            if (!word.containsKey(ch)) {
                return false;
            } else if (plate.get(ch) > word.get(ch)) {
                return false;
            }
        }
        return true;
    }
}

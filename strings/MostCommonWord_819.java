package strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class MostCommonWord_819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Long> map = Arrays.stream(paragraph.split("[!?',;.\\s]+"))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        for (String ban : banned) {
            map.remove(ban);
        }
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(1)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining());

    }
}

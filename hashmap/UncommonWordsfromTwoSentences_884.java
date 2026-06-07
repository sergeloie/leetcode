package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UncommonWordsfromTwoSentences_884 {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Long> map1 = Arrays.stream(s1.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> map2 = Arrays.stream(s2.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<String> result = new ArrayList<>();
        map1.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .filter(entry -> !map2.containsKey(entry.getKey()))
                .map(Map.Entry::getKey)
                .forEach(result::add);
        map2.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .filter(entry -> !map1.containsKey(entry.getKey()))
                .map(Map.Entry::getKey)
                .forEach(result::add);
        return result.toArray(new String[0]);



    }
}

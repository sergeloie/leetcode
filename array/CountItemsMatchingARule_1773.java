package array;

import java.util.List;

public class CountItemsMatchingARule_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIndex = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> throw new IllegalStateException("Unexpected value: " + ruleKey);
        };
        return (int) items.stream().filter(item -> item.get(ruleIndex).equals(ruleValue)).count();
    }
}

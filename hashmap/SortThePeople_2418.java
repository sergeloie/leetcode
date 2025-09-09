package hashmap;

import java.util.Comparator;
import java.util.TreeMap;

public class SortThePeople_2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < heights.length; i++) {
            treeMap.put(heights[i], names[i]);
        }
        return treeMap.values().toArray(String[]::new);
    }
}

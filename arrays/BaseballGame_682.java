package arrays;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame_682 {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for (String s : operations) {
            switch (s) {
                case "C" -> list.removeLast();
                case "D" -> list.add(list.getLast() * 2);
                case "+" -> list.add(list.getLast() + list.get(list.size() - 2));
                default -> list.add(Integer.parseInt(s));
            }
        }
        return list.stream().reduce(0, Integer::sum);
    }
}

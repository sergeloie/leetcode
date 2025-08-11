package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThirdMaximumNumber_414 {
    public int thirdMax(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        return list.size() == 3 ? list.getLast() : list.getFirst();
    }
}

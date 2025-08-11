package arrays;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers_628 {

    public int maximumProduct(int[] nums) {
//        Arrays.sort(nums);


        int[] arr = fillArr(nums);
        int m1 = arr[0] * arr[1];
        int m2 = arr[2] * arr[3];

        if (arr[4] > 0) {
            return arr[4] * Math.max(m1, m2);
        } else {
            return arr[4] * Math.min(m1, m2);
        }
    }

    public int[] fillArr(int[] nums) {
        int[] arr = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int num : nums) {
            // Заполняем первые два индекса, где наименьшие числа.
            if (num < arr[0]) {
                arr[1] = arr[0];
                arr[0] = num;
            } else if (num < arr[1]) {
                arr[1] = num;
            }

            // Заполняем старшие три индекса, где наибольшие числа.
            if (num > arr[4]) {
                arr[2] = arr[3];
                arr[3] = arr[4];
                arr[4] = num;
            } else if (num > arr[3]) {
                arr[2] = arr[3];
                arr[3] = num;
            } else if (num > arr[2]) {
                arr[2] = num;
            }
        }
        return arr;
    }
}

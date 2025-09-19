package array;

import java.util.Arrays;

public class DuplicateZeros_1089 {
    public void duplicateZeros(int[] arr) {
        int[] temp = new int[arr.length];
        int arrIndex = 0;
        int tempIndex = 0;

        while (tempIndex < temp.length) {
            if (arr[arrIndex] == 0) {
                tempIndex++;
            } else {
                temp[tempIndex] = arr[arrIndex];
            }
            tempIndex++;
            arrIndex++;
        }
        System.arraycopy(temp, 0, arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

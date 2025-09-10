package array;

public class SumOfAllOddLengthSubarrays_1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int lastIndex = arr.length - 1;
        int sum = 0;
        for (int i = 0; i <= lastIndex; i++) {
            for (int j = 0; j <= lastIndex - i ; j = j + 2) {
                sum += subArrSum(arr, i, j + i);
            }
        }
        return sum;

    }

    public int subArrSum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end ; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

package array;

public class CountPartitionswithEvenSumDifference_3432 {
    public int countPartitions(int[] nums) {
        int parity = 0;
        for (int value : nums) {
            parity ^= (value & 1);
        }
        return parity == 0 ? nums.length - 1 : 0;
    }
}

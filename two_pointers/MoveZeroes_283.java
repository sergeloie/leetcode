package two_pointers;

public class MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
        for (int i = nums.length - 2; i >= 0 ; i--) {
            for (int j = 0; j <= i; j++) {
                if (nums[j] == 0) {
                    nums[j] = nums[j + 1];
                    nums[j + 1] = 0;
                }
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        int zero = 0;
        int notZero = 0;
        while (zero < nums.length && notZero < nums.length) {
            while (zero < nums.length && nums[zero] != 0) {
                zero++;
            }
            notZero = zero;
            while (notZero < nums.length && nums[notZero] == 0) {
                notZero++;
            }
            if (zero < nums.length && notZero < nums.length) {
                nums[zero] = nums[notZero];
                nums[notZero] = 0;
            }
        }
    }
}

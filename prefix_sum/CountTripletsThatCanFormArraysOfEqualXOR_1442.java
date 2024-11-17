package prefix_sum;

/*
https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/description/
1442. Count Triplets That Can Form Two Arrays of Equal XOR
Medium

Given an array of integers arr.

We want to select three indices i, j and k where (0 <= i < j <= k < arr.length).

Let's define a and b as follows:

    a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]
    b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]

Note that ^ denotes the bitwise-xor operation.

Return the number of triplets (i, j and k) Where a == b.



Example 1:

Input: arr = [2,3,1,6,7]
Output: 4
Explanation: The triplets are (0,1,2), (0,2,2), (2,3,4) and (2,4,4)

Example 2:

Input: arr = [1,1,1,1,1]
Output: 10

 */

import java.util.Arrays;

public class CountTripletsThatCanFormArraysOfEqualXOR_1442 {
    public int countTriplets(int[] arr) {
        int[] xor = new int[arr.length];
        int ans = 0;
        xor[0] = arr[0];
        for (int i = 1; i < xor.length; i++) {
            xor[i] = xor[i - 1] ^ arr[i];
        }
        for (int i = 0; i < xor.length - 1; i++) {
            for (int j = i + 1; j < xor.length; j++) {
                for (int k = j; k < xor.length; k++) {
                    int left_xor = xor[j - 1];
                    if (i - 1 >= 0) {
                        left_xor ^= xor[i - 1];
                    }
                    int right_xor = xor[k] ^ xor[j - 1];
                    if (left_xor == right_xor) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public int countTriplets2(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] ^ arr[i];
        }
        System.out.println(Arrays.toString(prefix));

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (prefix[i] == prefix[k + 1]) {
                    count += (k - i);
                }
            }
        }

        return count;
    }
}

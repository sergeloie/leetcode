package array_plus;
/*
https://leetcode.com/problems/valid-mountain-array/description/
941. Valid Mountain Array
Easy
Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]



Example 1:

Input: arr = [2,1]
Output: false
Example 2:

Input: arr = [3,5,5]
Output: false
Example 3:

Input: arr = [0,3,2,1]
Output: true
 */

public class ValidMountainArray_941 {
    public boolean validMountainArray(int[] arr) {
        if (arr.length <= 2) {
            return false;
        }

        int l = 0;
        int r = arr.length - 1;

        while ((l <= arr.length - 2) && (arr[l] < arr[l + 1])) {
            l++;
        }

        while ((r >= 1) && (arr[r] < arr[r - 1])) {
            r--;
        }
        if (l == 0 || r == arr.length - 1) {
            return false;
        }
        return l == r;
    }
}

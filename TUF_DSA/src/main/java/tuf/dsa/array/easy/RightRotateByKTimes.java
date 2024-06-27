package tuf.dsa.array.easy;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-array/submissions/
// https://takeuforward.org/data-structure/rotate-array-by-k-elements/

/**
 * The interface Right rotate by k times.
 */
public class RightRotateByKTimes {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 20;
        // output : 5 6 1 2 3 4
        // 6 5 4 3 2 1 (1st reverse)
        int len = arr.length - 1;
        k = k % arr.length; // if k > arr.length
        reverse(arr, 0, len);
        reverse(arr, 0, k - 1);
        reverse(arr, k, len);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Reverse.
     *
     * @param arr   the arr
     * @param start the start
     * @param end   the end
     */
    private static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

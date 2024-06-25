package tuf.dsa.array.easy;

import java.util.Arrays;

/**
 * The type Left rotate by k times.
 */
public class LeftRotateByKTimes {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        bruteForce(arr, arr.length, 2);
        int[] arr1 = {1, 2, 3, 4, 5};
        usingReverse(arr1, arr1.length - 1, 2);
    }

    /**
     * Using reverse.
     *
     * @param arr    the arr
     * @param length the length
     * @param k      the k
     */
    private static void usingReverse(int[] arr, int length, int k) {
        reverse(arr, 0, length);
        reverse(arr, 0, length - k);
        reverse(arr, length - k + 1, length);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Brute force.
     *
     * @param arr    the arr
     * @param length the length
     * @param k      the k
     */
    private static void bruteForce(int[] arr, int length, int k) {
        k = k % length;
        int[] temp = Arrays.copyOfRange(arr, 0, k);
        for (int i = 0; i < length - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = length - k; i < length; i++) {
            arr[i] = temp[i - length + k];
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Reverse.
     *
     * @param arr   the arr
     * @param start the start
     * @param end   the end
     */
    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

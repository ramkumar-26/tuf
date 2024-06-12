package tuf.dsa.array.easy;

import java.util.Arrays;

/**
 * The type Second largest element.
 */
// https://takeuforward.org/data-structure/find-second-smallest-and-second-largest-element-in-an-array/
public class SecondLargestElement {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 8, 8, 90, 90};
        System.out.println(secondLargestBySort(arr));
        System.out.println(secondLargestByFindingLargestFirst(arr));
        System.out.println(secondLargestElementBySingleIteration(arr));
    }

    /**
     * Second largest element by single iteration int.
     *
     * @param arr the arr
     * @return the int
     */
    private static int secondLargestElementBySingleIteration(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return -1;
        }
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            } else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        return second_large;
    }

    /**
     * Second largest by finding largest first int.
     *
     * @param arr the arr
     * @return the int
     */
    private static int secondLargestByFindingLargestFirst(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int minDiff = Integer.MAX_VALUE;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            int currDiff = max - arr[i];
            if (currDiff < minDiff && currDiff != 0) {
                minDiff = currDiff;
                ans = arr[i];
            }
        }
        return ans;

    }

    /**
     * Second largest by sort int.
     *
     * @param arr the arr
     * @return the int
     */
// only works if no duplicate
    private static int secondLargestBySort(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }
}

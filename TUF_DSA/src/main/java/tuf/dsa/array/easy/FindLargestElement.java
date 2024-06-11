package tuf.dsa.array.easy;

import java.util.Arrays;

/**
 * The type Find largest element.
 */
public class FindLargestElement {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 56, 90};
        System.out.println("BruteForce : " + findLargestUsingBruteForce(arr));
        System.out.println("Using sorting : " + findUsingSorting(arr));
        System.out.println("Using Recursion : " + findLargestUsingRecursion(arr, 0, arr.length - 1));
    }

    /**
     * Find using sorting int.
     *
     * @param arr the arr
     * @return the int
     */
    // the time complexity is  O(n log n), and the space complexity is either   O(n log n) or O(1), depending on the sorting algorithm's space requirements.
    private static int findUsingSorting(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    /**
     * Find largest using brute force int.
     *
     * @param arr the arr
     * @return the int
     */
    private static int findLargestUsingBruteForce(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    /**
     * Find largest using recursion int.
     *
     * @param arr the arr
     * @param i   the
     * @param n   the n
     * @return the int
     */
    //  both the time and space complexities of this function are O(n)
    // space complexity is determined by the maximum depth of the recursive call stack.
    //  the maximum depth will be n, because the function is called recursively n times before reaching the base case.
    private static int findLargestUsingRecursion(int[] arr, int i, int n) {
        if (i == n) {
            return arr[i];
        }
        return Math.max(arr[i], findLargestUsingRecursion(arr, ++i, n));
    }
}

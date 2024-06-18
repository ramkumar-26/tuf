package tuf.dsa.array.easy;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// TwoPointer
// https://takeuforward.org/data-structure/remove-duplicates-in-place-from-sorted-array/

/**
 * The type Remove duplicates.
 */
public class RemoveDuplicates {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 4, 4, 5, 6, 67, 67};
        System.out.println(removeDuplicate(arr1));
        int[] arr2 = {1, 1, 2, 3, 4, 4, 4, 5, 6, 67, 67};
        System.out.println(removeDuplicateUsingTwoPointer(arr2));
    }

    /**
     * Remove duplicate using two pointer int.
     *
     * @param arr the arr
     * @return the int
     */
    private static int removeDuplicateUsingTwoPointer(int[] arr) {
        int i = 0, j = 1;
        while (j < arr.length) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
//        for (int j = 1; j < arr.length; j++) {
//            if (arr[i] != arr[j]) {
//                i++;
//                arr[i] = arr[j];
//            }
//        }
        return i + 1;
    }

    /**
     * Remove duplicate int.
     *
     * @param arr the arr
     * @return the int
     */
    private static int removeDuplicate(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        AtomicInteger counter = new AtomicInteger(0);
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                arr[counter.getAndIncrement()] = arr[i];
            }
            set.add(arr[i]);
        }
        return set.size();
    }
}

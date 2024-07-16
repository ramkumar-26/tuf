package tuf.dsa.array.easy;

import java.util.Arrays;


// https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array/
/**
 * The type Move zeros.
 */
public class MoveZeros {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        System.out.println(Arrays.toString(moveZero1(arr, arr.length - 1)));
    }

    /**
     * Move zero 2 int [ ].
     *
     * @param a the a
     * @param n the n
     * @return the int [ ]
     */
    private static int[] moveZero2(int[] a, int n){
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1) return a;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }

    /**
     * Move zero 1 int [ ].
     *
     * @param arr the arr
     * @param len the len
     * @return the int [ ]
     */
    private static int[] moveZero1(int[] arr, int len) {
        int i = 0, j = 1;
        while (i < j && j <= len) {
            if (arr[i] == 0 && arr[j] != 0) {
                swap(arr, i++, j++);
            }else if(arr[i] == 0 && arr[j] == 0){
                j++;
            }else{
                i++;
                j++;
            }
        }
        return arr;
    }

    /**
     * Swap.
     *
     * @param arr the arr
     * @param i   the
     * @param j   the j
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

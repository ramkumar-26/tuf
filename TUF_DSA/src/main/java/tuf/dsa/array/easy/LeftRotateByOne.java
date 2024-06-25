package tuf.dsa.array.easy;

import java.util.Arrays;

/**
 * The type Left rotate by one.
 */
public class LeftRotateByOne {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] number1 = {1, 2, 3, 4, 5};
        usingExtraSpace(number1, number1.length);
        int[] number2 = {1, 2, 3, 4, 5};
        withoutExtraSpace(number2, number2.length);
    }

    /**
     * Without extra space.
     *
     * @param number the number
     * @param n      the n
     */
    private static void withoutExtraSpace(int[] number, int n) {
        int firstNum = number[0];
        for (int i = 0; i < n - 1; i++) {
            number[i] = number[i + 1];
        }
        number[n - 1] = firstNum;
    }

    /**
     * Using extra space.
     *
     * @param number the number
     * @param n      the n
     */
    private static void usingExtraSpace(int[] number, int n) {
        int[] newArr = new int[n];
        for (int i = 1; i < n; i++) {
            newArr[i - 1] = number[i];
        }
        newArr[n - 1] = number[0];
        System.out.println(Arrays.toString(newArr));
    }


}

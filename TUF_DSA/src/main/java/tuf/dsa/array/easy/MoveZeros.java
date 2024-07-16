package tuf.dsa.array.easy;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int[] arr2 = {0, 1, 2, 0, 3, 4};
        System.out.println(Arrays.toString(moveZero(arr2, arr2.length - 1)));
    }

    private static int[] moveZero(int[] arr, int len) {
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

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

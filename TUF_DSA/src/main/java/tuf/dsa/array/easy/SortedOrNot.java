package tuf.dsa.array.easy;

/**
 * The type Sorted or not.
 */
// https://takeuforward.org/data-structure/check-if-an-array-is-sorted/
public class SortedOrNot {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 7, 8, 90, 90};
        System.out.println(findSortOrNot(arr));
    }

    /**
     * Find sort or not boolean.
     *
     * @param arr the arr
     * @return the boolean
     */
    private static boolean findSortOrNot(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}

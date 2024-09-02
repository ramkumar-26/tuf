package meta;

import java.util.Arrays;

// #TwoPointers #BinarySearch
/**
 * The type Two sum 2.
 */
public class TwoSum2 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(getTwoSum2(nums, 18)));
    }

    /**
     * Get two sum 2 int [ ].
     *
     * @param nums   the nums
     * @param target the target
     * @return the int [ ]
     */
    static int[] getTwoSum2(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[]{i, j};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{};
    }


}

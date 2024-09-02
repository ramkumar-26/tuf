package structured.prefix.sum.medium;

//https://leetcode.com/problems/minimum-size-subarray-sum/

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Min sub array len.
 */
public class MinSubArrayLen {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println("Min Length : " + findMinLength(nums, target));
        Set set = new HashSet<>(Collections.singleton(nums));
    }

    /**
     * Find min length int.
     *
     * @param nums   the nums
     * @param target the target
     * @return the int
     */
    private static int findMinLength(int[] nums, int target) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        while (j < nums.length) {
            sum += nums[j];
            while (sum >= target) {
                sum -= nums[i];
                minLen = Math.min(minLen, j - i + 1);
                i++;
            }
            j++;
        }
        if (minLen == Integer.MAX_VALUE) {
            return 0;
        }
        return minLen;
    }
}

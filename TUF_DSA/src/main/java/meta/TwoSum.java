package meta;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Two sum.
 */
// #6
// https://leetcode.com/problems/two-sum/
// #HashMap
public class TwoSum {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] nums = {0, 7, 11, 2};
        int target = 9;
        System.out.println(Arrays.toString(getTwoSum(nums, target)));
    }

    /**
     * Get two sum int [ ].
     *
     * @param nums   the nums
     * @param target the target
     * @return the int [ ]
     */
    static int[] getTwoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int targetDiff = target - nums[i];
            if(map.containsKey(targetDiff)){
                return new int[]{map.get(targetDiff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

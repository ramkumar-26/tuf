package structured.prefix.sum.easy;

// https://leetcode.com/problems/find-pivot-index/

/**
 * The type Find pivot index.
 */
public class FindPivotIndex {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }

    /**
     * Pivot index int.
     *
     * @param nums the nums
     * @return the int
     */
    public static int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] prefixSum = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            prefixSum[i] = sum;
        }
        for (int i = 0; i < len; i++) {
            int leftSum = (i == 0) ? 0 : prefixSum[i-1];
            int rightSum = prefixSum[len - 1] - prefixSum[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    // PrefixSum will give sum of all the index until the currentIndex
    // From the last prefixSum if we delete the current index prefixSum,
    // We will get the sum of all the index in the rightSide as well.
}

package structured.prefix.sum.easy;

// https://leetcode.com/problems/range-sum-query-immutable/

/**
 * The type Range sum query.
 */
public class RangeSumQuery {
    /**
     * The Prefix.
     */
    int[] prefix;

    /**
     * Num array.
     *
     * @param nums the nums
     */
    public void NumArray(int[] nums) {
        prefix = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefix[i] = sum;
        }
    }

    /**
     * Sum range int.
     *
     * @param left  the left
     * @param right the right
     * @return the int
     */
    public int sumRange(int left, int right) {
        return prefix[right] - ((left == 0) ? 0 : prefix[left - 1]);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        RangeSumQuery rangeSumQuery = new RangeSumQuery();
        int[] nums = {1, 2, 3, 4, 5, 6};
        rangeSumQuery.NumArray(nums);
        System.out.println(rangeSumQuery.sumRange(0, 5));
    }
}

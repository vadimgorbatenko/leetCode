/**
 * 53. Maximum Subarray1
 * <p>
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * A subarray is a contiguous part of an array.
 * <p>
 * https://leetcode.com/problems/maximum-subarray/
 */
public class Problem53 {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxTillNow = sum;
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            maxTillNow = Math.max(maxTillNow, sum);
        }
        return maxTillNow;
    }
}

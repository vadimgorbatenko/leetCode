/**
 * 55. Jump Game
 * <p>
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * Return true if you can reach the last index, or false otherwise.
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
public class Problem55 {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        if (nums[0] == 0) {
            return false;
        }
        return isAccessible(nums.length - 1, nums);
    }

    private boolean isAccessible(int position, int[] nums) {
        for (int jumpLength = 1; jumpLength <= position; jumpLength++) {
            if (nums[position - jumpLength] >= jumpLength) {
                if (position - jumpLength == 0) {
                    return true;
                }
                return isAccessible(position - jumpLength, nums);
            }
        }
        return false;
    }


    /**
     * slow solver
     */
    private boolean imagineJumps(int fromPosition, int[] way) {
        System.out.println(fromPosition);
        if (way[fromPosition] + fromPosition + 1 >= way.length) {
            return true;
        }
        if (way[fromPosition] == 0) {
            return false;
        }
        for (int jumpLength = way[fromPosition]; jumpLength > 0; jumpLength--) {
            if (imagineJumps(fromPosition + jumpLength, way)) {
                return true;
            }
        }
        return false;
    }
}

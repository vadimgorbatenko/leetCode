/**
 * 189. Rotate Array
 * https://leetcode.com/problems/rotate-array/description/
 */
public class Problem189 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }
        int realK = k % nums.length;
        if (realK == 0) {
            return;
        }

        int[] copy = new int[realK];
        System.arraycopy(nums, nums.length - realK, copy, 0, realK);
        System.arraycopy(nums, 0, nums, realK, nums.length - realK);
        System.arraycopy(copy, 0, nums, 0, realK);
    }
}

/**
 * 704. Binary Search
 * <p>
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * <a href="https://leetcode.com/problems/binary-search/">...</a>
 */
public class Problem704 {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int idx = 0;
        while (l <= r) {
            idx = (r + l) / 2;
            if (nums[idx] == target) {
                return idx;
            } else if (nums[idx] < target) {
                l = idx + 1;
            } else {
                r = idx - 1;
            }
        }
        return -1;
    }
}

/**
 * 27. Remove Element
 * <p>
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the
 * elements may be changed. Then return the number of elements in nums which are not equal to val.
 * <p>
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the
 * following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The
 * remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * <p>
 * <a href="https://leetcode.com/problems/remove-element/">...</a>
 */
public class Problem27 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }
        }
        return nums.length - count;
    }
}

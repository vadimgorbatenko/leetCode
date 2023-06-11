/**
 * 88. Merge Sorted Array
 * <p>
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * <p>
 * <a href="https://leetcode.com/problems/merge-sorted-array/">...</a>
 */
public class Problem88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        int[] buf = new int[m];
        System.arraycopy(nums1, 0, buf, 0, m);
        int i = 0;
        int j = 0;
        for (int k = 0; k < n + m; k++) {
            if (i == m) {
                nums1[k] = nums2[j];
                j++;
                continue;
            }
            if (j == n) {
                nums1[k] = buf[i];
                i++;
                continue;
            }
            if (buf[i] <= nums2[j]) {
                nums1[k] = buf[i];
                i++;
                continue;
            }
            if (buf[i] > nums2[j]) {
                nums1[k] = nums2[j];
                j++;
                continue;
            }

        }
    }
}

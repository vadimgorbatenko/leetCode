import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 480. Sliding Window Median
 * <p>
 * The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle values.
 * For examples, if arr = [2,3,4], the median is 3.
 * For examples, if arr = [1,2,3,4], the median is (2 + 3) / 2 = 2.5.
 * You are given an integer array nums and an integer k. There is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 * Return the median array for each window in the original array. Answers within 10-5 of the actual value will be accepted.
 * <p>
 * <a href="https://leetcode.com/problems/sliding-window-median/">...</a>
 */
public class Problem480 {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];
        int[] window = new int[k];
        boolean isEven = k % 2 == 0;

        PriorityQueue<Integer> sliding = new PriorityQueue<>();
        sliding.add(nums[0]);
        sliding.add(nums[1]);
        sliding.add(nums[2]);
        sliding.add(nums[3]);
        sliding.add(nums[4]);
        sliding.add(nums[5]);
        sliding.add(nums[6]);

        for (int i = 0; i <= nums.length - k; i++) {
            System.arraycopy(nums, i, window, 0, k);
            Arrays.sort(window);
            int idx = k / 2;
            if (isEven) {
                result[i] = (double) (window[idx] + window[idx-1]) / 2.0d;
            } else {
                result[i] = (double) window[idx];
            }
        }
        return result;
    }
}

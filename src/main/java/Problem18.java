import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 18. 4Sum
 * <p>
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
 * 0 <= a, b, c, d < n
 * a, b, c, and d are distinct.
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * You may return the answer in any order.
 * <p>
 * <a href="https://leetcode.com/problems/4sum/">...</a>
 */
public class Problem18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                final long tar = (long)target - nums[i] - nums[j];
                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    final long sum = (long)nums[l] + nums[r];
                    if (tar == sum) {
                        set.add(List.of(nums[i], nums[j], nums[l], nums[r]));
                        while(l<r && nums[l]==nums[l+1]) l++;
                        while(r>l && nums[r]==nums[r-1]) r--;
                        l++;
                        r--;
                        continue;
                    }
                    if (sum > tar){
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}

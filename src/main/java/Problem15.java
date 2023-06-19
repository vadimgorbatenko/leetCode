import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 15. 3Sum
 * <a href="https://leetcode.com/problems/3sum/description/">...</a>
 */
public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            int sum;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    res.add(List.of(nums[i], nums[j], nums[k]));
                    while(j < k && nums[j] == nums[j+1]) {
                        j++;
                    }
                    while(j < k && nums[k] == nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                } else if(sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return res.stream().toList();
    }
}

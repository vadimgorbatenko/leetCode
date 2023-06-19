import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * <p>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * <p>
 * <a href="https://leetcode.com/problems/two-sum/description/">...</a>
 */
public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> valueToIdx = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            Integer j = valueToIdx.get(target - nums[i]);
            if(j != null){
                res[0] = j;
                res[1] = i;
                return res;
            }
            valueToIdx.put(nums[i], i);
        }
        return res;
    }
}

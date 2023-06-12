import java.util.HashMap;
import java.util.Map;

/**
 * 169. Majority Element
 * <p>
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * <p>
 * <a href="https://leetcode.com/problems/majority-element/">...</a>
 */
public class Problem169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> valueToCount = new HashMap<>();
        for (int num : nums) {
            valueToCount.merge(num, 1, Integer::sum);
        }
        int maxCount = 0;
        int majorityValue = nums[0];
        for (Map.Entry<Integer, Integer> entry : valueToCount.entrySet()){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();
                majorityValue = entry.getKey();
            }
        }

        return majorityValue;
    }
}

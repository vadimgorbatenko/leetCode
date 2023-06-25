import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 347. Top K Frequent Elements
 * <p>
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 * <p>
 * <a href="https://leetcode.com/problems/remove-invalid-parentheses/">...</a>
 */
public class Problem347 {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] freq = new ArrayList[nums.length + 1];
        int[] result = new int[k];
        int resAdded = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            int counter = map.getOrDefault(n,0);
            map.put(n, counter + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int i = entry.getValue();
            if (freq[i] == null) {
                freq[i] = new ArrayList<>();
            }
            freq[i].add(entry.getKey());
        }
        for (int j = freq.length - 1; j >=0; j--){
            if (freq[j] != null && !freq[j].isEmpty()){
                for (int ff : freq[j]) {
                    result[resAdded] = ff;
                    resAdded++;
                    if(resAdded == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}

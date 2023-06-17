import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 15. 3Sum
 * <a href="https://leetcode.com/problems/3sum/description/">...</a>
 */
public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        if (!containsTriplet(triplets, triplet)) {
                            triplets.add(triplet);
                        }
                    }
                }
            }
        }
        return triplets;
    }

    private boolean containsTriplet(List<List<Integer>> triplets, List<Integer> triplet) {
        for (List<Integer> t : triplets) {
            if (Integer.compare(t.get(0), triplet.get(0)) == 0
                    && Integer.compare(t.get(1), triplet.get(1)) == 0
                    && Integer.compare(t.get(2), triplet.get(2)) == 0) {
                return true;
            }
        }
        return false;
    }
}

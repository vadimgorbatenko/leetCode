import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class Problem15Test {
    private final Problem15 tripletSearcher = new Problem15();

    @Test
    public void threeSumTest() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = tripletSearcher.threeSum(nums);

        List<Integer> t1 = Arrays.asList(-1, -1, 2);
        List<Integer> t2 = Arrays.asList(-1, 0, 1);

        assertTrue(triplets.contains(t1));
        assertTrue(triplets.contains(t2));
    }

}

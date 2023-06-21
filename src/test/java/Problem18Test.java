import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem18Test {
    private final Problem18 solver = new Problem18();

    @Test
    public void test1() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> result = solver.fourSum(nums, 0);

        assertEquals(3, result.size());
        assertTrue(result.contains(List.of(-2, -1, 1, 2)));
        assertTrue(result.contains(List.of(-2, 0, 0, 2)));
        assertTrue(result.contains(List.of(-1, 0, 0, 1)));
    }

    @Test
    public void test2() {
        int[] nums = {2, 2, 2, 2, 2};
        List<List<Integer>> result = solver.fourSum(nums, 8);

        assertEquals(1, result.size());
        assertTrue(result.contains(List.of(2, 2, 2, 2)));
    }

}
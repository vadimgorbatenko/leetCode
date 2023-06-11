import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem27Test {
    private final Problem27 solver = new Problem27();

    @Test
    public void test1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] expected = {2, 2};
        check(nums, val, expected);
    }

    @Test
    public void test2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] expected = {0, 1, 3, 0, 4};
        check(nums, val, expected);
    }

    private void check(int[] nums, int val, int[] expectedNums) {
        int k = solver.removeElement(nums, val);

        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}

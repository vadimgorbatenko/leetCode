import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem26Test {
    private final Problem26 solver = new Problem26();

    @Test
    public void test1() {
        int[] nums = { 1, 1, 2 };
        int[] expected = { 1, 2 };
        check(nums, expected);
    }

    @Test
    public void test2() {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] expected = { 0, 1, 2, 3, 4 };
        check(nums, expected);
    }

    @Test
    public void test3() {
        int[] nums = { 1, 2, 3 };
        int[] expected = { 1, 2, 3 };
        check(nums, expected);
    }

    private void check(int[] nums, int[] expectedNums) {
        int k = solver.removeDuplicates(nums);

        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}

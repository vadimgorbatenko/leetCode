import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem1Test {
    private final Problem1 solver = new Problem1();

    @Test
    void test1() {
        // Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]
        // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        int[] res = solver.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, res);
    }

    @Test
    void test2() {
        // Input: nums = [3,2,4], target = 6
        // Output: [1,2]
        // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        int[] res = solver.twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, res);
    }

    @Test
    void test3() {
        // Input: nums = [3,3], target = 6
        // Output: [0,1]
        // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        int[] res = solver.twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, res);
    }
}
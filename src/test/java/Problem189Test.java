import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Problem189Test {
    private final Problem189 rotator = new Problem189();

    @Test
    public void withoutRotate() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotator.rotate(nums, 0);
        int[] res = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(res, nums);
    }

    @Test
    public void emptyArray() {
        int[] nums = {};
        rotator.rotate(nums, 4);
        int[] res = {};
        assertArrayEquals(res, nums);
    }

    @Test
    public void oneElementArray() {
        int[] nums = {3};
        rotator.rotate(nums, 4);
        int[] res = {3};
        assertArrayEquals(res, nums);
    }

    @Test
    public void oneRotation() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotator.rotate(nums, 1);
        int[] res = {7, 1, 2, 3, 4, 5, 6};
        assertArrayEquals(res, nums);
    }

    @Test
    public void threeRotations() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotator.rotate(nums, 3);
        int[] res = {5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(res, nums);
    }

    @Test
    public void rotateArrayLengthTimes() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotator.rotate(nums, nums.length);
        int[] res = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(res, nums);
    }

    @Test
    public void rotateArrayLengthTimesPlusThree() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotator.rotate(nums, nums.length + 3);
        int[] res = {5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(res, nums);
    }

}
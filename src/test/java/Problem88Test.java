import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class Problem88Test {
    private final Problem88 solver = new Problem88();

    @Test
    public void test1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] result = {1, 2, 2, 3, 5, 6};
        solver.merge(nums1, 3, nums2, 3);
        assertArrayEquals(result, nums1);
    }

    @Test
    public void test2() {
        int[] nums1 = {1};
        int[] nums2 = {};
        int[] result = {1};
        solver.merge(nums1, 1, nums2, 0);
        assertArrayEquals(result, nums1);
    }

    @Test
    public void test3() {
        int[] nums1 = new int[1];
        int[] nums2 = {1};
        int[] result = {1};
        solver.merge(nums1, 0, nums2, 1);
        assertArrayEquals(result, nums1);
    }

    @Test
    public void test4() {
        int[] nums1 = {4, 0, 0, 0, 0, 0};
        int[] nums2 = {1, 2, 3, 5, 6};
        int[] result = {1, 2, 3, 4, 5, 6};
        solver.merge(nums1, 1, nums2, 5);
        assertArrayEquals(result, nums1);
    }

    @Test
    public void test5() {
        int[] nums1 = {1, 2, 4, 5, 6, 0};
        int[] nums2 = {3};
        int[] result = {1, 2, 3, 4, 5, 6};
        solver.merge(nums1, 5, nums2, 1);
        assertArrayEquals(result, nums1);
    }
}
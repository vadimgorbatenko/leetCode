import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem53Test {
    Problem53 solver = new Problem53();

    @Test
    public void test1() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, solver.maxSubArray(arr));
    }

    @Test
    public void test2() {
        int[] arr = {1};
        assertEquals(1, solver.maxSubArray(arr));
    }

    @Test
    public void test3() {
        int[] arr = {5, 4, -1, 7, 8};
        assertEquals(23, solver.maxSubArray(arr));
    }
}

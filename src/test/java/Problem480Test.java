import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem480Test {
    private final Problem480 solver = new Problem480();

    @Test
    void test1() {
        double[] result = solver.medianSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 4);
        assertArrayEquals(new double[]{1.00000, -1.00000, -1.00000, 3.00000, 5.00000, 6.00000}, result);
    }

    @Test
    void test2() {
        double[] result = solver.medianSlidingWindow(new int[]{1, 2, 3, 4, 2, 3, 1, 4, 2}, 3);
        assertArrayEquals(new double[]{2.00000, 3.00000, 3.00000, 3.00000, 2.00000, 3.00000, 2.00000}, result);

    }

}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11Test {
    private final Problem11 solver = new Problem11();

    @Test
    void test1() {
        assertEquals(49, solver.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void test2() {
        assertEquals(1, solver.maxArea(new int[]{1, 1}));
    }

}
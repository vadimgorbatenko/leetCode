import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem136Test {
    private final Problem136 solver = new Problem136();

    @Test
    public void test1() {
        assertEquals(1, solver.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    public void test2() {
        assertEquals(4, solver.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    @Test
    public void test3() {
        assertEquals(1, solver.singleNumber(new int[]{1}));
    }

}
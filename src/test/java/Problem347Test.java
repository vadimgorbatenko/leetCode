import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem347Test {
    private final Problem347 solver = new Problem347();

    @Test
    void test1() {
        assertArrayEquals(new int[]{1, 2}, solver.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
    }

    @Test
    void test2() {
        assertArrayEquals(new int[]{1}, solver.topKFrequent(new int[]{1}, 1));
    }
}
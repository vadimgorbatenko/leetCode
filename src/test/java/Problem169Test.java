import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem169Test {
    private final Problem169 solver = new Problem169();

    @Test
    public void test1() {
        int[] nums = {3, 2, 3};
        assertEquals(3, solver.majorityElement(nums));
    }

    @Test
    public void test2() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        assertEquals(2, solver.majorityElement(nums));
    }

    @Test
    public void test3() {
        int[] nums = {3, 3, 4};
        assertEquals(3, solver.majorityElement(nums));
    }
}

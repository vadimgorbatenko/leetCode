import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem1342Test {
    private final Problem1342 solver = new Problem1342();

    @Test
    public void test1() {
        assertEquals(6, solver.numberOfSteps(14));
    }

    @Test
    public void test2() {
        assertEquals(4, solver.numberOfSteps(8));
    }
}
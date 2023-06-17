import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem20Test {
    private final Problem20 solver = new Problem20();

    @Test
    public void test1() {
        assertTrue(solver.isValid("()"));
    }

    @Test
    public void test2() {
        assertTrue(solver.isValid("()[]{}"));
    }

    @Test
    public void test3() {
        assertFalse(solver.isValid("(]"));
    }

    @Test
    public void test4() {
        assertFalse(solver.isValid("([)]"));
    }

    @Test
    public void test5() {
        assertFalse(solver.isValid("(])"));
    }
}
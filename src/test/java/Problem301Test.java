import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem301Test {
    private final Problem301 solver = new Problem301();

    @Test
    public void test1() {
        List<String> result = solver.removeInvalidParentheses("()())()");
        assertEquals(2, result.size());
        assertTrue(result.contains("(())()"));
        assertTrue(result.contains("()()()"));
    }

    @Test
    public void test2() {
        List<String> result = solver.removeInvalidParentheses("(a)())()");
        assertEquals(2, result.size());
        assertTrue(result.contains("(a())()"));
        assertTrue(result.contains("(a)()()"));
    }

    @Test
    public void test3() {
        List<String> result = solver.removeInvalidParentheses(")(");
        assertEquals(1, result.size());
        assertTrue(result.contains(""));
    }
}

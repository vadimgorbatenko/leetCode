import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem22Test {
    private final Problem22 solver = new Problem22();

    @Test
    public void test1() {
        assertEquals(List.of("()"), solver.generateParenthesis(1));
    }

    @Test
    public void test2() {
        List<String> result = solver.generateParenthesis(2);
        assertEquals(2, result.size());
        assertTrue(result.contains("(())"));
        assertTrue(result.contains("()()"));
    }
}
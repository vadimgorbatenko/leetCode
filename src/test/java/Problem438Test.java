import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem438Test {
    private final Problem438 solver = new Problem438();

    @Test
    void test1() {
        List<Integer> result = solver.findAnagrams("cbaebabacd", "abc");
        assertEquals(2, result.size());
        assertTrue(result.contains(0));
        assertTrue(result.contains(6));
    }

    @Test
    void test2() {
        List<Integer> result = solver.findAnagrams("abab", "ab");
        assertEquals(3, result.size());
        assertTrue(result.contains(0));
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
    }
}
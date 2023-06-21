import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem242Test {
    private final Problem242 solver = new Problem242();

    @Test
    void test1() {
        assertTrue(solver.isAnagram("anagram", "nagaram"));
    }

    @Test
    void test2() {
        assertFalse(solver.isAnagram("rat", "car"));
    }
}
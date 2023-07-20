import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem28Test {
    private final Problem28 solver = new Problem28();

    @Test
    public void test1() {
        assertEquals(0, solver.strStr("sadbutsad", "sad"));
    }

    @Test
    public void test2() {
        assertEquals(-1, solver.strStr("leetcode", "leeto"));
    }
}
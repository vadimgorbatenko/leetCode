import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem49Test {
    private final Problem49 solver = new Problem49();

    @Test
    public void test1() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solver.groupAnagrams(strs);

        assertEquals(3, result.size());
        assertTrue(result.contains(List.of("bat")));
        assertTrue(result.contains(List.of("tan", "nat")));
        assertTrue(result.contains(List.of("eat", "tea", "ate")));
    }
}
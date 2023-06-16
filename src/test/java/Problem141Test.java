import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem141Test {
    private final Problem141 solver = new Problem141();

    @Test
    void test1() {
        // head = [3,2,0,-4], pos = 1
        assertTrue(solver.hasCycle(buildList(List.of(3, 2, 0, 4), 1)));
    }

    @Test
    void test2() {
        // head = [1,2], pos = 0
        assertTrue(solver.hasCycle(buildList(List.of(1, 2), 0)));
    }

    @Test
    void test3() {
        // head = [1], pos = -1
        assertFalse(solver.hasCycle(buildList(List.of(1), -1)));
    }

    private Problem141.ListNode buildList(List<Integer> values, int pointToCycle) {
        ArrayList<Problem141.ListNode> nodes = new ArrayList<>(values.size());
        for (int i = 0; i < values.size(); i++) {
            nodes.add(new Problem141.ListNode(values.get(i)));
            if (i > 0) {
                nodes.get(i - 1).next = nodes.get(i);
            }
        }
        if (pointToCycle >= 0) {
            nodes.get(nodes.size() - 1).next = nodes.get(pointToCycle);
        }
        return nodes.get(0);
    }
}
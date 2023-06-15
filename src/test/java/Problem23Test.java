import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class Problem23Test {
    private final Problem23 solver = new Problem23();

    @Test
    void test1() {
        assertNull(solver.mergeKLists(new Problem23.ListNode[]{}));
    }

    @Test
    void test2() {
        //lists = [[1,4,5],[1,3,4],[2,6]]
        Problem23.ListNode[] arr = {
                buildList(List.of(1, 4, 5)),
                buildList(List.of(1, 3, 4)),
                buildList(List.of(2, 6))
        };
        assertNotNull(solver.mergeKLists(arr));
    }

    private Problem23.ListNode buildList(List<Integer> values) {
        Problem23.ListNode head = null;
        Problem23.ListNode prev = null;
        for (int value : values) {
            Problem23.ListNode cur = new Problem23.ListNode(value);
            if (head == null) {
                head = cur;
            } else {
                prev.next = cur;
            }
            prev = cur;
        }
        return head;
    }
}
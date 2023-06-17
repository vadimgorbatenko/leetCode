import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Problem206Test {
    private final Problem206 solver = new Problem206();

    @Test
    void test1() {
        // Input: head = [1,2,3,4,5]
        // Output: [5,4,3,2,1]
        Problem206.ListNode res = solver.reverseList(buildList(List.of(1, 2, 3, 4, 5)));
        System.out.println(getString(res));
    }

    @Test
    void test2() {
        // Input: head = [1,2]
        // Output: [2,1]
        Problem206.ListNode res = solver.reverseList(buildList(List.of(1, 2)));
        System.out.println(getString(res));
    }

    @Test
    void test3() {
        // Input: head = []
        // Output: []
        Problem206.ListNode res = solver.reverseList(null);
        System.out.println(getString(res));
    }

    private Problem206.ListNode buildList(List<Integer> values) {
        ArrayList<Problem206.ListNode> nodes = new ArrayList<>(values.size());
        for (int i = 0; i < values.size(); i++) {
            nodes.add(new Problem206.ListNode(values.get(i)));
            if (i > 0) {
                nodes.get(i - 1).next = nodes.get(i);
            }
        }
        return nodes.get(0);
    }

    private String getString(Problem206.ListNode head) {
        Problem206.ListNode cur = head;
        StringBuilder s = new StringBuilder();
        while (cur != null) {
            s.append(cur.val).append(" ");
            cur = cur.next;
        }
        return s.toString();
    }
}
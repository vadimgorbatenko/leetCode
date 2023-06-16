import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Problem2Test {
    private final Problem2 solver = new Problem2();

    @Test
    void test1() {
        // Input: l1 = [2,4,3], l2 = [5,6,4]
        // Output: [7,0,8]
        // Explanation: 342 + 465 = 807.
        Problem2.ListNode res = solver.addTwoNumbers(buildList(List.of(2, 4, 3)), buildList(List.of(5, 6, 4)));
        System.out.println(getString(res));
    }

    @Test
    void test2() {
        // Input: l1 = [0], l2 = [0]
        // Output: [0]
        Problem2.ListNode res = solver.addTwoNumbers(buildList(List.of(0)), buildList(List.of(0)));
        System.out.println(getString(res));
    }

    @Test
    void test3() {
        // Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        // Output: [8,9,9,9,0,0,0,1]
        Problem2.ListNode res = solver.addTwoNumbers(buildList(List.of(9, 9, 9, 9, 9, 9, 9)), buildList(List.of(9, 9, 9, 9)));
        System.out.println(getString(res));
    }

    private Problem2.ListNode buildList(List<Integer> values) {
        ArrayList<Problem2.ListNode> nodes = new ArrayList<>(values.size());
        for (int i = 0; i < values.size(); i++) {
            nodes.add(new Problem2.ListNode(values.get(i)));
            if (i > 0) {
                nodes.get(i - 1).next = nodes.get(i);
            }
        }
        return nodes.get(0);
    }

    private String getString(Problem2.ListNode head) {
        Problem2.ListNode cur = head;
        StringBuilder s = new StringBuilder();
        while (cur != null) {
            s.append(cur.val).append(" ");
            cur = cur.next;
        }
        return s.toString();
    }
}
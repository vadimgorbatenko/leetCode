/**
 * 141. Linked List Cycle
 * <p>
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 * <p>
 * <a href="https://leetcode.com/problems/merge-k-sorted-lists/">...</a>
 */
public class Problem141 {
    private final static int big_val = 10000000;

    public boolean hasCycle(ListNode head) {
        while (head != null && head.next != null) {
            if (head.val == big_val) {
                return true;
            }
            head.val = big_val;
            head = head.next;
        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

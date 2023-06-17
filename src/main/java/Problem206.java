/**
 * 206. Reverse Linked List
 * <p>
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * <p>
 * <a href="https://leetcode.com/problems/reverse-linked-list/">...</a>
 */
public class Problem206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = recursion(head);
        head.next = null;
        return newHead;
    }

    public ListNode recursion(ListNode cur) {
        ListNode end = null;
        if (cur.next.next == null) {
            end = cur.next;
            cur.next.next = cur;
            return end;
        } else {
            end = recursion(cur.next);
            cur.next.next = cur;
            return end;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

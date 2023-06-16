/**
 * 2. Add Two Numbers
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * <a href="https://leetcode.com/problems/add-two-numbers/description/">...</a>
 */
public class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addition = 0;
        int curVal = l1.val + l2.val;
        if (curVal >= 10) {
            curVal = curVal - 10;
            addition = 1;
        }
        ListNode resHead = new ListNode(curVal);
        ListNode cur = resHead;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null || l2 != null) {
            int l1val = 0;
            int l2val = 0;
            if (l1 != null) {
                l1val = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                l2val = l2.val;
                l2 = l2.next;
            }
            curVal = l1val + l2val + addition;
            addition = 0;
            if (curVal >= 10) {
                curVal = curVal - 10;
                addition = 1;
            }
            ListNode next = new ListNode(curVal);
            cur.next = next;
            cur = next;
        }
        if (addition == 1) {
            cur.next = new ListNode(1);
        }
        return resHead;
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

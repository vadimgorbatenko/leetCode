/**
 * 23. Merge k Sorted Lists
 * <p>
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 * <p>
 * <a href="https://leetcode.com/problems/merge-k-sorted-lists/">...</a>
 */
public class Problem23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (checkStopCondition(lists)){
            return null;
        }
        ListNode head = new ListNode(extractFirstMin(Integer.MAX_VALUE, lists));
        ListNode cur = head;
        while (!checkStopCondition(lists)) {
            ListNode next = new ListNode(extractFirstMin(cur.val, lists));
            cur.next = next;
            cur = next;
        }
        return head;
    }

    private int extractFirstMin(int curMin, ListNode[] lists) {
        int min = Integer.MAX_VALUE;
        int minIdx = 0;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null && curMin == lists[i].val){
                minIdx = i;
                min = lists[i].val;
                break;
            }
            if (lists[i] != null && lists[i].val < min) {
                minIdx = i;
                min = lists[i].val;
            }
        }
        lists[minIdx] = lists[minIdx].next;
        return min;
    }

    private boolean checkStopCondition(ListNode[] lists){
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                return false;
            }
        }
        return true;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

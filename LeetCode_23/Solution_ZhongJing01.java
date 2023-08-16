package LeetCode_23;

/**
 * @author ZhongJing </p>
 * @date 2023/08/14 </p>
 */
public class Solution_ZhongJing01 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length < 1) {
            return null;
        }
        ListNode cur = lists[0];
        for (int i = 1; i < lists.length; i++) {
            cur = mergeTwoLinkedList(cur, lists[i]);
        }
        return cur;
    }

    public ListNode mergeTwoLinkedList(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        ListNode newHead = new ListNode();
        ListNode temp = newHead;
        ListNode n1 = l1;
        ListNode n2 = l2;

        while (n1 != null && n2 != null) {
            if (n1.val < n2.val) {
                temp.next = n1;
                n1 = n1.next;
            } else {
                temp.next = n2;
                n2 = n2.next;
            }
            temp = temp.next;
        }

        if (n1 != null) {
            temp.next = n1;
        }

        if (n2 != null) {
            temp.next = n2;
        }

        return newHead.next;
    }

    class ListNode {
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

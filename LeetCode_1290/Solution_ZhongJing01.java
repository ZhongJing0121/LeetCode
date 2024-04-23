package LeetCode_1290;

import java.util.LinkedList;

/**
 * 1290.二进制链表转整数
 */
public class Solution_ZhongJing01 {
    public int getDecimalValue(ListNode head) {
        var stack = new LinkedList<Integer>();
        int res = 0;
        int base = 0;
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        while (!stack.isEmpty()) {
            res += (int) Math.pow(2, base++) * stack.pop();
        }

        return res;
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

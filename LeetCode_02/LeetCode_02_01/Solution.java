package LeetCode_02_01;

/**
 * 日期：2023-07-02
 * 作者：仲景
 */
public class Solution {
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

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            var newHead = new ListNode();
            var node = newHead;
            var node1 = l1;
            var node2 = l2;
            var num = 0;

            while (node1 != null || node2 != null) {
                var v1 = 0;
                var v2 = 0;

                if (node1 != null) {
                    v1 = node1.val;
                    node1 = node1.next;
                }

                if (node2 != null) {
                    v2 = node2.val;
                    node2 = node2.next;
                }

                var sum = v1 + v2 + num;
                num = sum >= 10 ? 1 : 0;
                node.next = new ListNode(sum % 10);
                node = node.next;
            }

            if (num > 0) {
                node.next = new ListNode(1);
            }

            return newHead.next;
        }
    }
}
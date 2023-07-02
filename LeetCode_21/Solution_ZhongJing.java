package LeetCode_21;

/**
 * 日期：2023-07-02
 * 作者：仲景
 */
public class Solution_ZhongJing {

    public class ListNode {
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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // 哨兵 -> 指向头节点
        ListNode sentinel = new ListNode(-1);

        // 临时变量，保存前一个节点，用来比较值
        ListNode tempPreNode = sentinel;

        // 循环，直到某个链表读完
        while (l1 != null && l2 != null) {

            // 比较两个链表头节点，小的链接到前一个节点的末尾
            if (l1.val <= l2.val) {
                tempPreNode.next = l1;
                // 临时节点变成刚链上的节点
                tempPreNode = l1;
                // 指针后移
                l1 = l1.next;
            } else {
                // 和上面一样
                tempPreNode.next = l2;
                tempPreNode = l2;
                l2 = l2.next;
            }
        }

        // 最后至少有一个链表是没有读完的，至少！
        // 因为两个链表都是默认有序的，所以找到那个没读完的链表，链到临时节点的尾部就ok
        tempPreNode.next = l1 == null ? l2 : l1;

        // 根据要求，不需要哨兵节点，所以返回哨兵的下一个节点，也就是合并后的第一个节点
        return sentinel.next;
    }
}

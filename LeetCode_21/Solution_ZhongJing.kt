package LeetCode_21

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

/**
 * 日期：2023-07-02
 * 作者：仲景
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null || list2 == null) {
            return list1 ?: list2
        }
        val newHead = ListNode(-1)
        var node = newHead
        var node1 = list1
        var node2 = list2

        while (node1 != null && node2 != null) {
            if (node1.`val` < node2.`val`) {
                node.next = node1
                node1 = node1.next
            } else {
                node.next = node2
                node2 = node2.next
            }
            node = node.next!!
        }

        node.next = node1 ?: node2

        return newHead.next
    }
}

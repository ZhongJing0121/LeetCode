class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

/**
 * 日期：2023-07-02
 * 作者：仲景
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val newHead = ListNode(-1)
        var node = newHead
        var node1 = l1
        var node2 = l2
        var num = 0

        while (node1 != null || node2 != null) {
            val sum = (node1?.`val` ?: 0) + (node2?.`val` ?: 0) + num
            num = if (sum >= 10) 1 else 0
            node.next = ListNode(sum % 10)
            node = node.next!!
            node1 = node1?.next
            node2 = node2?.next
        }

        if (num > 0) {
            node.next = ListNode(1)
        }

        return newHead.next
    }
}

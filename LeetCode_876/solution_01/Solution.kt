package LeetCode_876.solution_01

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    /**
     * 876.链表的中间结点
     */
    fun middleNode(head: ListNode?): ListNode? {
        var fast = head
        var slow = head
        while (fast?.next != null) {
            fast = fast.next!!.next
            slow = slow?.next
        }
        return slow
    }
}
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    """
    83.删除排序链表中的重复元素
    """
    
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        new_head = ListNode(-1, head)
        node = head
        while node:
            next_node = node.next
            while next_node and next_node.val == node.val:
                next_node = next_node.next
            node.next = next_node
            node = node.next
        return new_head.next
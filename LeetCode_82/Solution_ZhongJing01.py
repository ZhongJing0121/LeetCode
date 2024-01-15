from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    """
    82.删除排序链表中的重复元素 II
    """
    
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        newHead = ListNode(-1)
        newHead.next = head
        preNode, node = newHead, head
        while node and node.next:
            if node.val == node.next.val:
                while node.next and node.val == node.next.val:
                    node = node.next
                preNode.next = node.next
            else:
                preNode = node
            node = node.next
        return newHead.next
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        
        newHead = ListNode(next=head)
        temp = newHead
        
        while temp.next and temp.next.next:
            leftNode = temp.next
            rightNode = temp.next.next
            
            temp.next = rightNode
            leftNode.next = rightNode.next
            rightNode.next = leftNode
            
            temp = leftNode
        
        return newHead.next
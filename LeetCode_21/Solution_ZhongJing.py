import math
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    """
    日期：2023-08-04
    作者：仲景
    """
    
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        newHead = ListNode()
        node = newHead
        
        # 遍历list1和list2
        node1, node2 = list1, list2
        while node1 is not None or node2 is not None:
            # 如果有链表已空，节点值取最大值
            v1 = v2 = math.inf
            if node1 is not None:
                v1 = node1.val
            
            if node2 is not None:
                v2 = node2.val
            
            if v1 > v2:
                node.next = node2
                node2 = node2.next if node2 is not None else None
            else:
                node.next = node1
                node1 = node1.next if node1 is not None else None
            
            node = node.next
        
        return newHead.next
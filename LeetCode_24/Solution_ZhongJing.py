from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    """
    日期：2023-08-07
    作者：仲景
    """
    
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # 如果连两个节点都没有
        if head is None or head.next is None:
            return head
        
        # 新头结点
        newHead = ListNode(next=head)
        # 用于遍历链表的临时节点
        temp = newHead
        
        # 把当前节点temp的下一个节点和下下个节点互换位置
        while temp.next and temp.next.next:
            # 交换的节点1
            leftNode = temp.next
            # 交换的节点2
            rightNode = temp.next.next
            
            # 当前节点的next指向节点2
            temp.next = rightNode
            # 节点1的next指向节点2的next
            leftNode.next = rightNode.next
            # 节点2的next指向节点1
            rightNode.next = leftNode
            
            # 更新节点
            temp = leftNode
        
        return newHead.next
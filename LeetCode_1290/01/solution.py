# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：1290. 二进制链表转整数
    链接：https://leetcode.cn/problems/convert-binary-number-in-a-linked-list-to-integer/description/
    思路：为什么一次遍历就可以算出结果？
    如果二进制为[1,1,1,1,1]，计算过程就是1*2^4 + 1*2^3 + 1*1^2+ 1*2^1 + 1*2^0
    通过秦九韶算法进行因式分解可以把式子化简成
    1*2^4 + 1*2^3 + 1*2^2 + 1*2^1 + 1*2^0
    = (1*2^3 + 1*2^2 + 1*2^1 + 1) * 2 + 1
    = ((1*2^2 + 1*2^1 + 1) * 2 + 1) * 2 + 1
    = (((1*2^1 + 1) * 2 + 1) * 2 + 1) * 2 + 1
    = ((((1) * 2 + 1) * 2 + 1) * 2 + 1) * 2 + 1
    按照最后化简的形式可以得出，只要每次累计乘以2并且加上当前位置数就可以正向遍历计算出二进制的十进制表达，
    可以理解为，每次res*2的过程是发现之前的最高位比预料中的还多一位，所以要补乘2
    """

    def getDecimalValue(self, head: Optional[ListNode]) -> int:
        res = 0
        while head:
            res = res * 2 + head.val
            head = head.next
        return res

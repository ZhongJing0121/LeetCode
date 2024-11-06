from collections import deque
from math import inf
from queue import Queue
from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    """
    1161.最大层内元素和
    Author: 仲景
    Date: 2024/11/6
    """

    def maxLevelSum(self, root: Optional[TreeNode]) -> int:
        # 当前层级, 最大层级和, 最大和层级, 队列
        level, maxSum, maxLevel, queue = 1, -inf, 1, deque([root])
        while queue:
            # 当前层的个数， 当前层的节点和
            curSize, curSum = len(queue), 0
            while curSize:
                tmp = queue.popleft()
                curSum += tmp.val
                if tmp.left: queue.append(tmp.left)
                if tmp.right: queue.append(tmp.right)
                curSize -= 1
            if curSum > maxSum:
                maxLevel, maxSum = level, curSum
            level += 1
        return maxLevel

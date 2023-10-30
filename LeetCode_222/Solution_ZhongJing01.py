# Definition for a binary tree node.
from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    # 222.完全二叉树的节点个数
    def countNodes(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        
        return self.countNodes(root.left) + self.countNodes(root.right) + 1
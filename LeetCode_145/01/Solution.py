from typing import Optional, List


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    """
    145.二叉树的后序遍历
    """
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res, stack, node, preNode = [], [root] if root else [], None, root
        while stack:
            node = stack[0]
            if node.left and preNode != node.left and preNode != node.right:
                stack.append(node.left)
            elif node.right and preNode != node.right:
                stack.append(node.right)
            else:
                res.append(stack.pop().val)
                preNode = node
        return res

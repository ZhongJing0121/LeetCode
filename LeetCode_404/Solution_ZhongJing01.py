from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    """
    404.左叶子之和
    思路：因为求的是叶子节点，所以其实是一个自顶向下的过程，那么就不可以使用类似树形DP的方式来做了，因为树形DP是自底向上的过程
    设置一个全局变量sum，在向下递推的过程中，在过程中根据一个变量isLeft来判断当前节点是否是左节点,
    如果当前节点是左叶子节点，那么就将其值加到sum上，最后直接返回sum即可，不再归约
    """
    
    def __init__(self):
        self.sum = 0
    
    def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
        self.process(root, False)
        return self.sum
    
    def process(self, root: Optional[TreeNode], isLeft: bool):
        if root is None:
            return
        if root.left is None and root.right is None and isLeft:
            self.sum += root.val
        self.process(root.left, True)
        self.process(root.right, False)
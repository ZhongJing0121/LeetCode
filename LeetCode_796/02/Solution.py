class Solution:
    """
    796.旋转字符串
    """

    def rotateString(self, s: str, goal: str) -> bool:
        return len(s) == len(goal) and goal in (s + s)

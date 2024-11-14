class Solution:
    """
    3174.清除数字
    Author: 仲景
    Date: 2024/11/14
    """

    def clearDigits(self, s: str) -> str:
        stack = []
        for c in s:
            # 如果是数字，删除左边最近的字母
            if c.isdigit():
                del stack[-1]
            else:
                stack.append(c)
        return ''.join(stack)

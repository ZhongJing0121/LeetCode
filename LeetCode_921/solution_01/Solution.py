class Solution:
    """
    921.使括号有效的最少添加
    Author: 仲景
    Date: 2024/10/22
    """

    def minAddToMakeValid(self, s: str) -> int:
        left, res = 0, 0
        for c in s:
            left += 1 if c == '(' else - 1
            if left < 0:
                left = 0
                res += 1
        return res + left

class Solution:
    """
    2315.统计星号
    Author: 仲景
    Date: 2024/11/6
    """

    def countAsterisks(self, s: str) -> int:
        flag, res = True, 0
        for c in s:
            if c == '*' and flag:
                res += 1
            if c == '|':
                flag = not flag
        return res

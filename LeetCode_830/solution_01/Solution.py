from typing import List


class Solution:
    """
    830.较大分组的位置
    Author: 仲景
    Date: 2024/11/6
    """

    def largeGroupPositions(self, s: str) -> List[List[int]]:
        res, i, n = list(), 0, len(s)
        while i < n:
            next = i
            while next < n and s[next] == s[i]:
                next += 1
            if next - i > 2:
                res.append([i, next])
            i = next
        return res

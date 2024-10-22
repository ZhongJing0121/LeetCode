from typing import List


class Solution:
    """
    2399.检查相同字母间的距离
    Author: 仲景
    Date: 2024/10/22
    """

    def checkDistances(self, s: str, distance: List[int]) -> bool:
        charMap = {}
        for i, c in enumerate(s):
            # 如果是第二次出现
            if c in charMap and i - charMap[c] - 1 != distance[ord(c) - ord('a')]:
                return False
            charMap[c] = i
        return True

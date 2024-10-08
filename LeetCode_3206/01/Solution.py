from typing import List


class Solution:
    """
    3206.交替组 I
    """

    def numberOfAlternatingGroups(self, colors: List[int]) -> int:
        n, l, res = len(colors), 0, 0
        for i in range(1, n * 2):
            if colors[(i - 1) % n] == colors[i % n]:
                l = 0
            l += 1
            if i >= n and l >= 3:
                res += 1
        return res

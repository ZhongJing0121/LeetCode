from typing import List


class Solution:
    """
    2923.找到冠军 I
    Author: 仲景
    Date: 2024/10/18
    """

    def findChampion(self, grid: List[List[int]]) -> int:
        res = 0
        for i, row in enumerate(grid):
            if row[res]:
                res = i
        return res

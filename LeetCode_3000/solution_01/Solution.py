from typing import List


class Solution:
    """
    3000.对角线最长的矩形的面积
    Author: 仲景
    Date: 2024/11/6
    """

    def areaOfMaxDiagonal(self, dimensions: List[List[int]]) -> int:
        return max(((x * x + y * y, x * y) for x, y in dimensions))[1]

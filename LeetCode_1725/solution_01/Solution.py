from typing import List


class Solution:
    """
    1725.可以形成最大正方形的矩形数目
    """

    def countGoodRectangles(self, rectangles: List[List[int]]) -> int:
        minRectangles = [min(r) for r in rectangles]
        return minRectangles.count(max(minRectangles))

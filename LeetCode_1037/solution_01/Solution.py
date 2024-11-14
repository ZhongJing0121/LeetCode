from typing import List


class Solution:
    """
    1037.有效的回旋镖
    Author: 仲景
    Date: 2024/11/14
    """

    def isBoomerang(self, points: List[List[int]]) -> bool:
        return ((points[1][0] - points[0][0]) * (points[2][1] - points[0][1])
                != (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]))

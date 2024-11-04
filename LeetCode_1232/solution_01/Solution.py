from typing import List


class Solution:
    """
    1232.缀点成线
    Author: 仲景
    Date: 2024/11/4
    """

    def checkStraightLine(self, coordinates: List[List[int]]) -> bool:
        x1, y1 = coordinates[0][0], coordinates[0][1]
        x2, y2 = coordinates[1][0], coordinates[1][1]
        return all([(i[1] - y2) * (x2 - x1) == (y2 - y1) * (i[0] - x2) for i in coordinates[2:]])

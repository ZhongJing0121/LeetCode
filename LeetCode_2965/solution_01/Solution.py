from typing import List


class Solution:
    """
    2965.找出缺失和重复的数字
    Author: 仲景
    Date: 2024/10/23
    """

    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        n = len(grid)
        numMap = [0] * (n ** 2 + 1)
        for row in grid:
            for num in row:
                numMap[num] += 1

        res = [0, 0]
        for i in range(1, n ** 2 + 1):
            if numMap[i] == 0:
                res[1] = i
            if numMap[i] == 2:
                res[0] = i
        return res

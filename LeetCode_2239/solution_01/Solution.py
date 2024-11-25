from math import inf
from typing import List


class Solution:
    """
    2239.找到最接近 0 的数字
    Description: 一次遍历
    Author: 仲景
    Date: 2024/11/25
    """

    def findClosestNumber(self, nums: List[int]) -> int:
        minDiff, res = inf, -inf
        for num in nums:
            curNumAbs = abs(num)
            if curNumAbs < minDiff:
                minDiff = curNumAbs
                res = num
            elif curNumAbs == minDiff:
                res = max(res, num)
        return res

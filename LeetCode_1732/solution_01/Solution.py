from itertools import accumulate
from typing import List


class Solution:
    """
    1732.找到最高海拔
    Description:
    Author: 仲景
    Date: 2024/11/25
    """

    def largestAltitude(self, gain: List[int]) -> int:
        preSum, res = 0, 0
        for g in gain:
            preSum += g
            res = max(res, preSum)
        return res

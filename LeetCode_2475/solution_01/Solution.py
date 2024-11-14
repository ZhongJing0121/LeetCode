from collections import Counter
from typing import List


class Solution:
    """
    2475.数组中不等三元组的数目
    Author: 仲景
    Date: 2024/11/14
    """

    def unequalTriplets(self, nums: List[int]) -> int:
        res, leftCount, rightCount = 0, 0, len(nums)
        for curCount in Counter(nums).values():
            rightCount -= curCount
            res += leftCount * curCount * rightCount
            leftCount += curCount
        return res

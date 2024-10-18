from typing import List


class Solution:
    """
    2154.将找到的值乘以 2
    Author: 仲景
    Date: 2024/10/18
    """

    def findFinalValue(self, nums: List[int], original: int) -> int:
        numSet = set(nums)
        while original in numSet:
            original *= 2
        return original

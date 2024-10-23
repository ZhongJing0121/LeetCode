from typing import List


class Solution:
    """
    2016.增量元素之间的最大差值
    Author: 仲景
    Date: 2024/10/23
    """

    def maximumDifference(self, nums: List[int]) -> int:
        preMinNumer, maxDiff = nums[0], -1
        for i in range(1, len(nums)):
            if nums[i] > preMinNumer:
                maxDiff = max(maxDiff, nums[i] - preMinNumer)
            else:
                preMinNumer = nums[i]
        return maxDiff

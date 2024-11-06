from typing import List


class Solution:
    """
    2465.不同的平均值数目
    Author: 仲景
    Date: 2024/11/6
    """

    def distinctAverages(self, nums: List[int]) -> int:
        nums.sort()
        return len(set(nums[i] + nums[len(nums) - 1 - i] for i in range((len(nums)) // 2)))

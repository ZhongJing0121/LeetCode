from typing import List


class Solution:
    """
    2395.和相等的子数组
    Author: 仲景
    Date: 2024/11/6
    """

    def findSubarrays(self, nums: List[int]) -> bool:
        return len(set(sum(nums[i:i + 2]) for i in range(len(nums) - 1))) < len(nums) - 1

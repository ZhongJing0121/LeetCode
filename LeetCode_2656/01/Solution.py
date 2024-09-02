from typing import List


class Solution:
    def maximizeSum(self, nums: List[int], k: int) -> int:
        """2656.K 个元素的最大和"""
        # 等差数列求和
        return (max(nums) * 2 + k - 1) * k // 2

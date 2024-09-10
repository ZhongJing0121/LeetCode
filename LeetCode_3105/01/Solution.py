from typing import List


class Solution:
    """
    3105.最长的严格递增或递减子数组
    """

    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        res, n = 1, len(nums)
        dp = [1] * n
        for i in range(1, n):
            if nums[i] > nums[i - 1]:
                dp[i] = dp[i - 1] + 1
                res = max(res, dp[i])
        dp = [1] * 10
        for i in range(1, n):
            if nums[i] < nums[i - 1]:
                dp[i] = dp[i - 1] + 1
                res = max(res, dp[i])
        return res

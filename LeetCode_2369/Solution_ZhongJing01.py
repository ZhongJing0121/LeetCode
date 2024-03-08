from typing import List


class Solution:
    """
    2369.检查数组是否存在有效划分
    """
    
    def validPartition(self, nums: List[int]) -> bool:
        n = len(nums)
        dp = [False] * (n + 1)
        dp[0] = True
        for i, num in enumerate(nums):
            if (i > 0 and dp[i - 1] and num == nums[i - 1]) \
                    or (i > 1 and dp[i - 2]
                        and (
                                (num == nums[i - 1] + 1 and num == nums[i - 2] + 2)
                                or
                                (num == nums[i - 1] == nums[i - 2])
                        )
            ):
                dp[i + 1] = True
        return dp[n]
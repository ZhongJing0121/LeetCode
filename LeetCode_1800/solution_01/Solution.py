from typing import List


class Solution:
    """
    1800.最大升序子数组和
    """

    def maxAscendingSum(self, nums: List[int]) -> int:
        curSum, maxSum = nums[0], nums[0]
        for i in range(1, len(nums)):
            if nums[i] > nums[i - 1]:
                curSum += nums[i]
            else:
                maxSum = max(curSum, maxSum)
                curSum = nums[i]
        return max(maxSum, curSum)

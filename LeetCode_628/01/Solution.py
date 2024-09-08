from typing import List


class Solution:
    """
    628.三个数的最大乘积
    """

    def maximumProduct(self, nums: List[int]) -> int:
        # 排序
        nums.sort()
        length = len(nums)
        return max(nums[0] * nums[1] * nums[length - 1], nums[length - 1] * nums[length - 2] * nums[length - 3])

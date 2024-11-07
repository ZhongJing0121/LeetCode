from typing import List


class Solution:
    """
    2164.对奇偶下标分别排序
    Author: 仲景
    Date: 2024/11/7
    """

    def sortEvenOdd(self, nums: List[int]) -> List[int]:
        # 奇数下标排序
        nums[1::2] = sorted(nums[1::2], reverse=True)
        # 偶数下标排序
        nums[::2] = sorted(nums[::2])
        return nums

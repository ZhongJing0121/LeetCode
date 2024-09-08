from typing import List


class Solution:
    """
    896.单调数列
    """

    def isMonotonic(self, nums: List[int]) -> bool:
        # 如果小于2个，一定单调
        if len(nums) <= 2: return True
        z, j = False, False
        for i in range(1, len(nums)):
            if nums[i] > nums[i - 1]:
                z = True
            if nums[i] < nums[i - 1]:
                j = True
            if z + j > 1:
                return False
        return True

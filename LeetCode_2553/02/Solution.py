from typing import List


class Solution:
    """
    2553.分割数组中数字的数位
    """

    def separateDigits(self, nums: List[int]) -> List[int]:
        res = []
        for i in range(len(nums) - 1, -1, -1):
            num = nums[i]
            while num > 0:
                res.append(num % 10)
                num //= 10
        return res[::-1]

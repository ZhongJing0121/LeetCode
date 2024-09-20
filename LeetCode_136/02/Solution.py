from typing import List


class Solution:
    """
    136.只出现一次的数字
    """
    def singleNumber(self, nums: List[int]) -> int:
        res = 0
        for num in nums:
            res ^= num
        return res

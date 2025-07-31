from typing import List


# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：3065. 超过阈值的最少操作数 I
    链接：https://leetcode.cn/problems/minimum-operations-to-exceed-threshold-value-i/description/
    思路：统计数组中小于k的数字的个数即可
    """

    def minOperations(self, nums: List[int], k: int) -> int:
        return sum(num < k for num in nums)

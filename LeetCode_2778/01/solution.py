from typing import List

# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：2778. 特殊元素平方和
    链接：https://leetcode.cn/problems/sum-of-squares-of-special-elements/description/
    思路：无
    """

    def sumOfSquares(self, nums: List[int]) -> int:
        return sum(num ** 2 for idx, num in enumerate(nums, 1) if len(nums) % idx == 0)

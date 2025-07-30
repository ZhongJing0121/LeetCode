from typing import List

# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：1913. 两个数对之间的最大乘积差
    链接：https://leetcode.cn/problems/maximum-product-difference-between-two-pairs/description/
    思路：乘积的差要求最大，那就要用最大的2个数的乘积减去最小的两个数的乘积
    """

    def maxProductDifference(self, nums: List[int]) -> int:
        nums.sort(reverse=True)
        return nums[0] * nums[1] - nums[-1] * nums[-2]

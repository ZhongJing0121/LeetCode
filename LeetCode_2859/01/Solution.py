from typing import List


class Solution:
    """
    2859.计算 K 置位下标对应元素的和
    """

    def sumIndicesWithKSetBits(self, nums: List[int], k: int) -> int:
        return sum([v for i, v in enumerate(nums) if countOneInNum(i) == k])


def countOneInNum(num: int) -> int:
    """
    求一个数字的二进制中有几个1
    """
    res = 0
    while num > 0:
        num &= num - 1
        res += 1
    return res

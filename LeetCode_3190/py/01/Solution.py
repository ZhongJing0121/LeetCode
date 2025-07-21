from typing import List


# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：3190. 使所有元素都可以被 3 整除的最少操作数
    链接：https://leetcode.cn/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/description/
    思路：每次可以给任意一个元素+1或者-1，那么只要计算和能被3整除的数字的最小差值就可以了
    对于某个数字距离3和3的倍数的最小差值，我们可以分成两种情况，当这个数减去x的时候，可以向下得到3或者3的倍数，记x
    当这个数加上y的时候，也可以向上得到3或者3的倍数，记y，那么最小的差值就是min(x, y)
    当我们使用num % 3的时候，有可能会得到x也有可能得到y，不管得到是x还是y，使用3-(x or y)都可以得到x和y
    时间复杂度：O(n)
    """

    def minimumOperations(self, nums: List[int]) -> int:
        return sum([min(num % 3, 3 - (num % 3)) for num in nums])

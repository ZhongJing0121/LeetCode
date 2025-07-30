# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：2413. 最小偶倍数
    链接：https://leetcode.cn/problems/smallest-even-multiple/description/
    思路：
    """

    def smallestEvenMultiple(self, n: int) -> int:
        return (n % 2 + 1) * n

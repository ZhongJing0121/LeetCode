# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：2894. 分类求和并作差
    链接：https://leetcode.cn/problems/divisible-and-non-divisible-sums-difference/description/
    思路：通过数学公式可以算出[1,n]中有多少个数字是m的整数倍，然后通过等差数列求和求出所有m整数倍的和就是num2。
    通过等差数列求和公式算出[1,n]的总和sum，那么sum - num2就是num1，也就是[1,n]中不能被m整数的数的总和
    通过一步步化简得出答案：n * (1 + n) // 2 - n // m * (n // m + 1) * m
    时间复杂度：O(1)
    空间复杂度：O(1)
    """

    def differenceOfSums(self, n: int, m: int) -> int:
        # 有多少个数可以被m整除
        # k = n // m
        # 等差数列求和
        # num2 = k * (m + k * m) // 2
        # num1 = n * (1 + n) // 2 - num2
        # (n * (1 + n) // 2) - (k * (m + k * m) // 2) - (k * (m + k * m) // 2)
        # (n * (1 + n) // 2) - (k * (m + k * m))
        # (n * (1 + n) // 2) - (k * (k + 1) * m)
        # (n * (1 + n) // 2) - (n // m * (n // m + 1) * m)
        return n * (1 + n) // 2 - n // m * (n // m + 1) * m

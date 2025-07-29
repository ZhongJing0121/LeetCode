# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：2894. 分类求和并作差
    链接：https://leetcode.cn/problems/divisible-and-non-divisible-sums-difference/description/
    思路：一行写法，除了装B一无是处
    时间复杂度：O(n)
    空间复杂度：O(1)
    """

    def differenceOfSums(self, n: int, m: int) -> int:
        return sum(num for num in range(1, n + 1) if num % m != 0) - sum(num for num in range(1, n + 1) if num % m == 0)

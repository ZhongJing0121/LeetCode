# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：2894. 分类求和并作差
    链接：https://leetcode.cn/problems/divisible-and-non-divisible-sums-difference/description/
    思路：遍历一次求出[0,n]序列中无法被m整除的数字的总和、可以被m整除的数字的总和，两者相减即可
    时间复杂度：O(n)，只需要从[0,n]遍历一次
    空间复杂度：O(1)，只需要2个变量存储
    """

    def differenceOfSums(self, n: int, m: int) -> int:
        num1 = num2 = 0
        for num in range(n + 1):
            if num % m != 0:
                num1 += num
            else:
                num2 += num
        return num1 - num2

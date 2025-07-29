# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：1281. 整数的各位积和之差
    链接：https://leetcode.cn/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
    思路：对10取模运算可以得到当前个位数的数字，然后除以10向下取整删除当前个位数字，依次循环就可以得到n的各个位的数字，
    然后根据题意求出答案
    时间复杂度：O(n)
    空间复杂度：O(1)
    """

    def subtractProductAndSum(self, n: int) -> int:
        product = 1
        sum = 0
        while n:
            d = n % 10
            product *= d
            sum += d
            n //= 10
        return product - sum

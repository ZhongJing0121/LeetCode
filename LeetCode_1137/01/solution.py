# noinspection PyMethodMayBeStatic
class Solution:
    """
    题目：1137. 第 N 个泰波那契数
    链接：https://leetcode.cn/problems/n-th-tribonacci-number/description/
    思路：简单的递归，可以推倒成动态规划，因为某一个位置只和前面的3个数有关系，所以直接使用3个变量即可，不需要用数组
    时间复杂度：O(n)
    空间复杂度：O(1)，因为只用了3个变量
    """
    def tribonacci(self, n: int) -> int:
        if n == 2:
            return 1
        if n < 2:
            return n
        n0, n1, n2 = 0, 1, 1
        for i in range(3, n + 1):
            n0, n1, n2 = n1, n2, n0 + n1 + n2
        return n2


class Solution:
    """
    2180.统计各位数字之和为偶数的整数个数
    Description:
    Author: 仲景
    Date: 2024/11/25
    """

    def countEven(self, num: int) -> int:
        res = 0
        for i in range(1, num + 1):
            curNumBitSum = self.numBitSum(i)
            res += curNumBitSum % 2 == 0
        return res

    def numBitSum(self, num: int) -> int:
        """
        求数字各位的总和
        """
        sum = 0
        while num:
            sum += num % 10
            num //= 10
        return sum

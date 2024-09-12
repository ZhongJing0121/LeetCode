from typing import List


class Solution:
    """
    2535.数组元素和与数字和的绝对差
    """

    def differenceOfSum(self, nums: List[int]) -> int:
        elementSum = numSum = 0

        for num in nums:
            elementSum += num
            numSum += self.numBitSum(num)

        return abs(elementSum - numSum)

    def numBitSum(self, n: int) -> int:
        """
        求数字每一位的和
        """
        res = 0
        while n > 0:
            res += n % 10
            n //= 10
        return res

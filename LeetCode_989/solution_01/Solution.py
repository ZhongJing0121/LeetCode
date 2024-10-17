from typing import List


class Solution:
    """
    989.数组形式的整数加法
    Author: 仲景
    Date: 2024/10/17
    """

    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        # 把k转成数字数组
        num2 = self.numToArray(k)
        # 两个数字数组相加
        return self.twoNumArrayAdd(num, num2)

    def twoNumArrayAdd(self, num1: List[int], num2: List[int]) -> List[int]:
        res = []
        # d是进位标识
        i, j, d = len(num1) - 1, len(num2) - 1, 0

        while i >= 0 or j >= 0 or d > 0:
            sum = d
            if i >= 0:
                sum += num1[i]
                i -= 1
            if j >= 0:
                sum += num2[j]
                j -= 1

            res.append(sum % 10)
            d = sum // 10
        # 反转结果
        return res[::-1]

    def numToArray(self, num: int) -> List[int]:
        """
        数字转数字数组
        """
        if num == 0:
            return [0]
        res = []

        while num > 0:
            res.append(num % 10)
            num //= 10
        # 反转结果
        return res[::-1]

from typing import List


class Solution:
    """
    2239.找到最接近 0 的数字
    Description: Python一行
    Author: 仲景
    Date: 2024/11/25
    """

    def findClosestNumber(self, nums: List[int]) -> int:
        return min((abs(num), -num, num) for num in nums)[2]

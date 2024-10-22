from typing import List


class Solution:
    """
    2293.极大极小游戏
    Author: 仲景
    Date: 2024/10/22
    """

    def minMaxGame(self, nums: List[int]) -> int:
        n = len(nums)
        while n > 1:
            n //= 2
            for i in range(n):
                a, b = nums[i * 2], nums[i * 2 + 1]
                nums[i] = min(a, b) if i % 2 == 0 else max(a, b)
        return nums[0]

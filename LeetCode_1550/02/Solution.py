from typing import List


class Solution:
    """
    1550.存在连续三个奇数的数组
    """

    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        return any((i % 2 and j % 2 and k % 2) for i, j, k in zip(arr, arr[1:], arr[2:]))

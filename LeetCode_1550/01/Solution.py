from typing import List


class Solution:
    """
    1550.存在连续三个奇数的数组
    """

    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        c = 0

        for num in arr:
            if num % 2 == 0:
                c = 0
            else:
                c += 1
            if c == 3:
                return True

        return False

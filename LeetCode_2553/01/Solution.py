from typing import List


class Solution:
    """
    2553.分割数组中数字的数位
    """

    def separateDigits(self, nums: List[int]) -> List[int]:
        return [n for num in nums for n in map(int, str(num))]

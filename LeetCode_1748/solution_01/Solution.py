from collections import Counter
from typing import List


class Solution:
    """
    1748.唯一元素的和
    """

    def sumOfUnique(self, nums: List[int]) -> int:
        return sum([num for num, count in Counter(nums).items() if count == 1])

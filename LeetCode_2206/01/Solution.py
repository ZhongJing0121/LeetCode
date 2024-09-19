from collections import Counter
from typing import List


class Solution:
    """
    2206.将数组划分成相等数对
    """

    def divideArray(self, nums: List[int]) -> bool:
        return all(c % 2 == 0 for c in Counter(nums).values())

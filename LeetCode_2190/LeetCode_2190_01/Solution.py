from collections import Counter
from itertools import pairwise
from typing import List


class Solution:
    def mostFrequent(self, nums: List[int], key: int) -> int:
        """
        2190.数组中紧跟 key 之后出现最频繁的数字
        """
        return Counter(y for x, y in pairwise(nums) if x == key).most_common(1)[0][0]

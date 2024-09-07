from collections import defaultdict
from typing import List


class Solution:
    """
    2176.统计数组中相等且可以被整除的数对
    """

    def countPairs(self, nums: List[int], k: int) -> int:
        nums_map = defaultdict(list)
        res = 0
        for i, num in enumerate(nums):
            res += sum(index * i % k == 0 for index in nums_map[num])
            nums_map[num].append(i)
        return res

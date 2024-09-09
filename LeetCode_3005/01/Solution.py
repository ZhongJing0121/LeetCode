from collections import Counter
from typing import List


class Solution:
    """
    3005.最大频率元素计数
    """

    def maxFrequencyElements(self, nums: List[int]) -> int:
        res = maxCount = 0
        counter = Counter()
        for num in nums:
            counter[num] += 1
            if counter[num] > maxCount:
                maxCount = res = counter[num]
            elif counter[num] == maxCount:
                res += counter[num]
        return res

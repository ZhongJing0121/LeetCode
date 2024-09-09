from typing import List


class Solution:
    """
    1848.到目标元素的最小距离
    """

    def getMinDistance(self, nums: List[int], target: int, start: int) -> int:
        return min([abs(i - start) for i, v in enumerate(nums) if v == target])

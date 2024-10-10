from typing import List


class Solution:
    """
    2357.使数组中所有元素都等于零
    """

    def minimumOperations(self, nums: List[int]) -> int:
        return len(set(i for i in nums if i != 0))

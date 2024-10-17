from typing import List


class Solution:
    """
    1385.两个数组间的距离值
    Author: 仲景
    Date: 2024/10/17
    """

    def findTheDistanceValue(self, arr1: List[int], arr2: List[int], d: int) -> int:
        return sum(all(abs(a1 - a2) > d for a2 in arr2) for a1 in arr1)

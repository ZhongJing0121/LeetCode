from typing import List


class Solution:
    """
    2540.最小公共值
    Python一行
    Author: 仲景
    Date: 2024/11/5
    """

    def getCommon(self, nums1: List[int], nums2: List[int]) -> int:
        return min(set(nums1) & set(nums2), default=-1)
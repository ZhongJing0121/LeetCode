from typing import List


class Solution:
    """
    2605.从两个数字数组里生成最小数字
    Author: 仲景
    Date: 2024/10/22
    """

    def minNumber(self, nums1: List[int], nums2: List[int]) -> int:
        s = set(nums1) & set(nums2)
        if s: return min(s)
        x, y = min(nums1), min(nums2)
        return min(x * 10 + y, y * 10 + x)

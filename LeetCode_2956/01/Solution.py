from typing import List


class Solution:
    """
    2956.找到两个数组中的公共元素
    """

    def findIntersectionValues(self, nums1: List[int], nums2: List[int]) -> List[int]:
        # py中，做运算时true会变成1，false会变成0
        return [sum(x in set(nums2) for x in nums1), sum(x in set(nums1) for x in nums2)]

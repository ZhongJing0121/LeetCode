from typing import List


class Solution:
    """
    2540.最小公共值
    不是一行
    Author: 仲景
    Date: 2024/11/5
    """

    def getCommon(self, nums1: List[int], nums2: List[int]) -> int:
        i, n = 0, len(nums2)
        for n1 in nums1:
            # 如果nums2的当前数字比nums1小，nums2往后移，直到nums2结束
            while i < n and nums2[i] < n1:
                i += 1
            # 如果相等直接返回
            if i < n and nums2[i] == n1:
                return n1
        return -1

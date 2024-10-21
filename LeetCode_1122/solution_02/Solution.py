from typing import List


class Solution:
    """
    1122.数组的相对排序
    Author: 仲景
    Date: 2024/10/21
    """

    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        arr1Heap = [0] * 1001
        for num in arr1:
            arr1Heap[num] += 1
        res, index = [], 0
        for num in arr2:
            res.extend([num] * arr1Heap[num])
            arr1Heap[num] = 0
        for i in range(1001):
            if arr1Heap[i] != 0:
                res.extend([i] * arr1Heap[i])
        return res

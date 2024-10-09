import heapq
from typing import List


class Pire:

    def __init__(self, index: int, value: int):
        self.index = index
        self.value = value

    def __lt__(self, other):
        if self.value == other.value:
            return self.index < other.index
        return self.value < other.value


class Solution:
    """
    1337.矩阵中战斗力最弱的 K 行
    备注：使用小根堆解题
    """

    def kWeakestRows(self, mat: List[List[int]], k: int) -> List[int]:
        # 创建小根堆
        minHeap: List[Pire] = []
        for index, nums in enumerate(mat):
            heapq.heappush(minHeap, Pire(index, nums.count(1)))
        res = []
        for i in range(k):
            res.append(heapq.heappop(minHeap).index)
        return res

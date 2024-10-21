from collections import Counter
from typing import List


class Solution:
    """
    1217.玩筹码
    Author: 仲景
    Date: 2024/10/21
    """

    def minCostToMoveChips(self, position: List[int]) -> int:
        m = Counter([num % 2 for num in position])
        return min(m[0], m[1])

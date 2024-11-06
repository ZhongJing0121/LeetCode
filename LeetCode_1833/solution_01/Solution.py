from typing import List


class Solution:
    """
    1833.雪糕的最大数量
    Author: 仲景
    Date: 2024/11/6
    """

    def maxIceCream(self, costs: List[int], coins: int) -> int:
        costs.sort()
        res = 0
        for cost in costs:
            if cost <= coins:
                res += 1
                coins -= cost
        return res

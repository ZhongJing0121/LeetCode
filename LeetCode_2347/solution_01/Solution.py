from collections import Counter
from itertools import pairwise
from typing import List


class Solution:
    """
    2347.最好的扑克手牌
    Author: 仲景
    Date: 2024/10/22
    """

    def bestHand(self, ranks: List[int], suits: List[str]) -> str:
        # 是否同花
        if all(a == b for a, b in pairwise(suits)):
            return "Flush"

        rankMap = Counter(ranks)
        # 是否三条
        if any(cnt >= 3 for cnt in rankMap.values()):
            return "Three of a Kind"
        # 是否对子
        if any(cnt >= 2 for cnt in rankMap.values()):
            return "Pair"
        # 其他
        return "High Card"

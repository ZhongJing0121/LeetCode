from typing import List


class Solution:
    """
    2279.装满石头的背包的最大数量
    Author: 仲景
    Date: 2024/11/5
    """

    def maximumBags(self, capacity: List[int], rocks: List[int], additionalRocks: int) -> int:
        # 按照剩余容量从小到大排序
        remainList = sorted([capacity[i] - rocks[i] for i in range(len(capacity))])

        res = 0
        for remain in remainList:
            # 如果不满，但是可以填满，或者本来就是满的
            if remain <= additionalRocks:
                res += 1
                additionalRocks -= remain
            else:
                break
        return res

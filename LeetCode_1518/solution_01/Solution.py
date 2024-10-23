class Solution:
    """
    1518.换水问题
    Author: 仲景
    Date: 2024/10/23
    """

    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        res = numBottles
        while numBottles // numExchange > 0:
            res += numBottles // 3
            numBottles = numBottles // numExchange + numBottles % numExchange
        return res

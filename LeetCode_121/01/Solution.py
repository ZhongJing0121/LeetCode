from typing import List


class Solution:
    """
    121.买卖股票的最佳时机
    """

    def maxProfit(self, prices: List[int]) -> int:
        minPrice, maxProfit = int('inf'), 0
        for price in prices:
            if price < minPrice:
                minPrice = price
            elif price - minPrice > maxProfit:
                maxProfit = price - minPrice
        return maxProfit

package LeetCode_2706.`01`

/**
 * 2706.购买两块巧克力
 */
class Solution {
    fun buyChoco(prices: IntArray, money: Int): Int {
        var min1 = if (prices[0] < prices[1]) prices[0] else prices[1]
        var min2 = if (min1 == prices[0]) prices[1] else prices[0]
        for (i in 2..prices.lastIndex) {
            if (prices[i] < min1) {
                min2 = min1.also { min1 = prices[i] }
            } else if (prices[i] < min2) {
                min2 = prices[i]
            }
        }
        return if (min1 + min2 > money) money else money - min1 - min2
    }
}
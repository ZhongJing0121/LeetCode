package LeetCode_1475.`01`


/**
 * 1475.商品折扣后的最终价格
 */
class Solution {
    fun finalPrices(prices: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        prices.forEachIndexed { i, price ->
            while (stack.isNotEmpty() && prices[stack.last()] >= price) {
                val targetIndex = stack.removeLast()
                prices[targetIndex] -= price
            }
            stack.addLast(i)
        }
        return prices
    }
}
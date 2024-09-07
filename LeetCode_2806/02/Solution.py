class Solution:
    """
    2806.取整购买后的账户余额
    """

    def accountBalanceAfterPurchase(self, purchaseAmount: int) -> int:
        return 100 - (purchaseAmount + 5) // 10 * 10

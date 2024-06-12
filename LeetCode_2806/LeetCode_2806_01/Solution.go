package LeetCode_2806_01

// 2806.取整购买后的账户余额
func accountBalanceAfterPurchase(purchaseAmount int) int {
	return 100 - (purchaseAmount+5)/10*10
}

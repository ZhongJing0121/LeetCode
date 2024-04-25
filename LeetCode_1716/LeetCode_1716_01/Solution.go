// package LeetCode_1716_01
package main

// 1716.计算力扣银行的钱
func totalMoney(n int) (res int) {
	// 等差数列求和
	a, b := n/7, n%7
	a1, an := (1+7)*7/2, (a+(a+6))*7/2
	res, a = (a1+an)*a/2, a+1
	res += (a + (a + b - 1)) * b / 2
	return
}

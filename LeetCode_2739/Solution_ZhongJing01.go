// Package LeetCode_2739 总行驶距离
package LeetCode_2739

func distanceTraveled(mainTank int, additionalTank int) (res int) {
	// 邮箱里至少需要5个油
	for mainTank >= 5 {
		// 当前邮箱一共可以从备用邮箱抽几个油
		addCount := mainTank / 5
		// 加公里数
		res += addCount * 50
		// 修改油箱
		mainTank %= 5
		// 可以抽几个不代表备用油箱有油，取最小值
		addCount = min(addCount, additionalTank)
		// 备用油箱减去抽取的油
		additionalTank -= addCount
		// 油箱加抽取的油
		mainTank += addCount
	}
	// 最后剩下的直接计算公里数即可
	res += mainTank * 10
	return
}

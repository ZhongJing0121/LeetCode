// Package LeetCode_1441 用栈操作构建数组
package LeetCode_1441

const (
	PUSH = "Push"
	POP  = "Pop"
)

func buildArray(target []int, n int) []string {
	res, preNum := make([]string, 0), 0

	for _, curNum := range target {
		// 处理上一个数字和当前数字之间的出入栈
		// 需要把当前数字避开，因为当前数字只有Push
		for i := 0; i < curNum-preNum-1; i++ {
			res = append(res, PUSH, POP)
		}
		// 记录当前数字的操作数
		res = append(res, PUSH)
		// 迭代
		preNum = curNum
	}
	return res
}

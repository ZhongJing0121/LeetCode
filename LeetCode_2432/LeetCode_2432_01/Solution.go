package LeetCode_2432_01

// 2432.处理用时最长的那个任务的员工
func hardestWorker(n int, logs [][]int) int {
	maxId, maxTime, preTime := 0, -1, 0

	for _, v := range logs {
		if curTime := v[1] - preTime; curTime > maxTime {
			maxId = v[0]
			maxTime = curTime
		} else if curTime == maxTime {
			maxId = min(v[0], maxId)
		}
		preTime = v[1]
	}

	return maxId
}

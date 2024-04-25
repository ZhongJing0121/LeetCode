package LeetCode_2545_01

import "sort"

// 2545.根据第 K 场考试的分数排序
func sortTheStudents(score [][]int, k int) [][]int {
	sort.Slice(score, func(i, j int) bool {
		return score[i][k] > score[j][k]
	})
	return score
}

func Solution(score [][]int, k int) [][]int {
	return sortTheStudents(score, k)
}

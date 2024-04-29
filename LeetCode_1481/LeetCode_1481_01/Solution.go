package LeetCode_1481_01

import "sort"

// KeyValue 键值对
type KeyValue struct {
	Key   int
	Value int
}

// 1481.不同整数的最少数目
func findLeastNumOfUniqueInts(arr []int, k int) int {
	countMap := make(map[int]int)

	// 每个数字出现的次数
	for _, v := range arr {
		countMap[v]++
	}

	// 遍历map
	kvSlice := make([]KeyValue, 0, len(countMap))
	for key, v := range countMap {
		kvSlice = append(kvSlice, KeyValue{Key: key, Value: v})
	}

	// 按出现次数排序
	sort.Slice(kvSlice, func(i, j int) bool {
		return kvSlice[i].Value < kvSlice[j].Value
	})

	count := 0
	for index := 0; k > 0; {
		d := min(kvSlice[index].Value, k)
		kvSlice[index].Value -= d
		if kvSlice[index].Value == 0 {
			count++
			index++
		}
		k -= d
	}
	return len(kvSlice) - count
}
